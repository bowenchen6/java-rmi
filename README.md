# java-rmi
Learn Java RMI

1. 现在我们只有一个例子，运行下面命令来测试运行程序。

        git clone https://github.com/bowenchen6/java-rmi.git
        cd java-rmi/example/rmi/
        javac -d classes/ *.java
        cd classes/
        rmiregistry & (在windows平台使用　start rmiregistry)
        java example.rmi.Server // Server ready

2. 打开另外一个终端，在classes目录下运行下面命令即可获取程序运行结果。

        java example.rmi.Client　　// response: Hello, World!

参考维基百科和oracle文档，以及[Michael的博文](http://miknight.blogspot.com/2005/09/how-to-get-java-rmi-going-on-mac-os-x.html)
