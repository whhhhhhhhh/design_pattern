package edu.hebut.factory.abstractfactory.factory;

import edu.hebut.factory.abstractfactory.product.Fridge;
import edu.hebut.factory.abstractfactory.product.Television;

/**
 * 工厂模式优点
 *
 * 系统可以在不修改具体工厂角色的情况下引进新的产品。
 * 客户端不必关心对象如何创建，明确了职责。
 * 更好的理解面向对象的原则，面向接口编程，而不要面向实现编程。
 *
 * 常见应用JDBC
 */
public interface Factory {

    Television createTelevision();
    Fridge createFridge();

}
