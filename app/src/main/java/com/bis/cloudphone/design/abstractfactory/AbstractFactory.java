package com.bis.cloudphone.design.abstractfactory;

/**
 * 作者： 江海锋
 * 添加时间： 2020/7/29 10:44
 * 作用 ： 工厂方法模式
 * 示例 ： 实现工厂方法模式
 * 抽象工厂应用场景： 程序需要处理不同系列的相关产品，产品不依赖与具体类的实现时，可以使用抽象工厂
 * 抽象工厂的优点：1.符合开闭原则（解耦，修改和关闭）
 *              2.符合单一责任原则（不同的产品只需要关心产品相关的实现，不需要再添加相关的接口类）
 *              3.减少代码入侵（保证底层代码不受影响）
 *              4.兼容性强（添加新的功能产品时，只需要实现类就行）
 *
 * 抽象工厂和工厂方法模式的区别在于抽象工厂比工厂方法更加抽象
 * 工厂方法 ：使用相同的工厂（工厂方法不可定义，产品方法可定义）进行组合而成
 * 抽象工厂 ：由不同的工厂和不同的产品组合而成（工厂和方法均可自定义）
 */
public class AbstractFactory {


    public static void createFactory(){


        IDataBaseUtils iDataBaseUtils1= new SqlitDataBaseUtils();
        IConnect iConnect1 = iDataBaseUtils1.getConnection();
        iConnect1.connectDataBase();
        ICommand command1 = iDataBaseUtils1.getCommand();
        command1.command();

        IDataBaseUtils iDataBaseUtils2= new FileDataBaseUtils();
        IConnect iConnect2 = iDataBaseUtils2.getConnection();
        iConnect2.connectDataBase();
        ICommand command2 = iDataBaseUtils2.getCommand();
        command2.command();


    }

}











































