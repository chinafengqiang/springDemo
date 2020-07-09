package cn.feng.dp.chain;

/**
 * <p>职责链模式抽象角色</p>
 *
 * @author: JQ.Feng
 * @create: 2020-03-13
 */
public abstract class GatewayHandler {
    protected GatewayHandler nextGatewayHandler;

    public void setNextGatewayHandler(GatewayHandler nextGatewayHandler){
        this.nextGatewayHandler = nextGatewayHandler;
    }

    /**
     * 实现的handler 处理方案 强制必须实现
     */
    public abstract void service();

    protected void nextService(){
        if(nextGatewayHandler != null){
            nextGatewayHandler.service();
        }
    }
}

