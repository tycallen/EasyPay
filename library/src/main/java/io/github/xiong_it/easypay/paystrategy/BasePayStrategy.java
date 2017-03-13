package io.github.xiong_it.easypay.paystrategy;

/**
 * Author: michaelx
 * Create: 17-3-13.
 * <p>
 * Endcode: UTF-8
 * <p>
 * Blog:{@see <a href="http://blog.csdn.net/xiong_it">http://blog.csdn.net/xiong_it</a>} | {@see <a href="https://xiong-it.github.io">https://xiong-it.github.io</a>}
 * github:{@see <a href="https://github.com/xiong-it">https://github.com/xiong-it</a>}
 * <p>
 * Description:支付策略类抽象类.
 */

public abstract class BasePayStrategy {
    public abstract void toPay();
}