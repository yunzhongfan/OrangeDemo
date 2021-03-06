package cj.org.queue;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;


/**
 * Jms  队列消息提供者
 * 队列消息测试
 *
 * @author nbc
 * @create 2017-12-28 15:24
 **/
public class QueueProvide {

    /** 指定ActiveMQ服务的地址 */
    private static final String URL = "tcp://127.0.0.1:61616";
    /** 指定队列的名称 */
    private static final String QUEUE_NAME = "queue-test";

    public static void main(String[] args) throws JMSException {

        // 1.创建ConnectionFactory
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(URL);

        // 2.创建Connection
        Connection connection = connectionFactory.createConnection();

        // 3.启动连接
        connection.start();

        // 4.创建会话（第一个参数：是否在事务中处理）
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        // 5. 创建一个目标
        Destination destination = session.createQueue(QUEUE_NAME);

        // 6.创建一个生产者

        MessageProducer producer = session.createProducer(destination);


        for (int i = 0; i < 100; i++) {

            // 7.创建消息
            TextMessage textMessage = session.createTextMessage("test" + i);

            // 8.发布消息
            producer.send(textMessage);

            System.out.println("消息发送：" + textMessage.getText());
        }

        // 9.关闭连接
        connection.close();
    }


}
