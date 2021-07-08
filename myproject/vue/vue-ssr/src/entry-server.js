import { createApp } from './app';

export default (context) => {
    const { app } = createApp()
    return app;
}

// 服务端不需要 挂载 没有DOM 节点