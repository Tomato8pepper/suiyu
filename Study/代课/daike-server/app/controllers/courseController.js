const userModel = require('../models/user.js')
const courseModel = require('../models/course.js')
const { v4: uuidv4 } = require('uuid')
const formatDate = require('../../utils/formatDate.js')

module.exports = {
    // 获取所有的课程
    getCourse: async (ctx, next) => {
        let req = ctx.request.body
        const courses = await courseModel.find(
            {
                status: req.status
            },
            {
                _id: 0
            }
        )
        if (courses) {
            ctx.status = 200;
            ctx.body = {
                code: 1,
                data: courses
            }
        } else {
            ctx.status = 200;
            ctx.body = {
                code: 0,
                msg: '参数错误！'
            }
        }
    },
    // 发布课程
    publishCourse: async (ctx, next) => {
        const uuid = uuidv4()
        let req = ctx.request.body
        ctx.status = 200
        if (!req.publisher || !req.schoolId || !req.courseTime || !req.coursePlace) {
            ctx.body = {
                code: 0,
                msg: '缺少必要参数！'
            }
            return;
        }
        req.id = uuid
        const result = await courseModel.create(req)
        if (result) {
            ctx.body = {
                code: 1,
                msg: '发布成功！'
            }
        } else {
            ctx.body = {
                code: 0,
                msg: '发布失败！'
            }
        }
    },
    // 代课
    substitute: async (ctx, next) => {
        const req = ctx.request.body
        ctx.status = 200;
        if (!req.userId || !req.userName) {
            ctx.body = {
                code: 0,
                msg: '缺少必要参数！'
            }
            return
        }
        const course = req.course
        if (req.userId === course.publisher) {
            ctx.body = {
                code: 0,
                msg: '发布者和代课这是同一个人！'
            }
            return
        }
        const receiver = await courseModel.findOne(
            { id: course.id },
            { receiver: 1 }
        )
        if (receiver.receiver) {
            ctx.body = {
                code: 0,
                msg: '很遗憾， 被别人捷足先登了'
            }
            return
        }

        const result = await courseModel.update(
            { id: course.id },
            { $set: { status: 'received', closeTime: formatDate(new Date()) }, receiver: req.userId, receiverName: req.userName }
        )
        if (result.nModified) {
            ctx.body = {
                code: 1
            }
        } else {
            ctx.body = {
                code: 0,
                msg: '代课失败！'
            }
        }
    },
    collectCourse: async (ctx, next) => {
        const req = ctx.request.body;
        const userId = req.userId;
        const courseId = req.courseId;

        if (!userId || !courseId) {
            ctx.status = 200;
            ctx.body = {
                code: 0,
                msg: '收藏成功！'
            }
            return;
        }

        const result = await User_col.findOne({
            userId
        }, {
            collections: 1,
            _id: 0
        });

        const collections = result.collections;

        ctx.status = 200;
        if (collections.includes(courseId)) {
            ctx.body = {
                code: 1,
                msg: '已收藏该课程！'
            }
            return;
        }

        collections.push(courseId);

        await User_col.update({
            userId: req.userId
        }, {
            $set: {
                collections,
            }
        });

        ctx.body = {
            code: 1,
            msg: '收藏成功！'
        }
    },
    getCourseByType: async (ctx, next) => {
        const req = ctx.request.body;
        const userId = req.userId;
        const type = req.type;

        ctx.status = 200;
        if (!userId || !type) {
            ctx.body = {
                code: 0,
                msg: '缺少必要参数！'
            }
            return;
        }

        let courses = [];
        if (type == 'publish') {
            courses = await Course_col.find({
                publisher: userId
            }, { _id: 0 });
        } else if (type == 'substitute') {// receiver
            courses = await Course_col.find({
                receiver: userId
            }, { _id: 0 });
        } else {
            const result = await User_col.findOne({
                userId
            }, {
                collections: 1,
                _id: 0
            });

            const collections = result.collections;

            for (let collection of collections) {
                const course = await Course_col.findOne({
                    id: collection
                }, {
                    _id: 0
                });

                courses.push(course);
            }
        }

        ctx.body = {
            code: 1,
            data: courses
        }
    }
}