# 浮动 float
浮动会让元素脱离文档流，间接导致父容器高度坍塌

# 清除float带来的负面影响
1.在浮动元素后面添加一个空容器<div style="clear: left;"></div>
2.给浮动元素父容器添加一个伪类
    .claerfix::after{
        content:'';
        clear: left;
        display: table;
    }

3.BFC -- Block Formatting Context
    解决元素脱离文档流带来的负面影响,margin重叠问题
    bfc的触发方式