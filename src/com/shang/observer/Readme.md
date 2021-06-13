## 观察者模式
- [主题接口](Subject.java)
- [主题抽象类](SubjectAbstract.java)
- [主题类](MySubject.java)
- [观察者接口](Observer.java)
- [观察者1](Observer1.java)
- [观察者2](Observer2.java)
- [观察者模式测试](ObserverTest.java)

观察者模式很好理解，类似于邮件订阅和 RSS 订阅，当我们浏览一些博客或 wiki 时，
经常会看到 RSS 图标，这的意思就是，当你订阅了该文章，如果后续有更新，会及时通知你。
其实，简单来讲就一句话:

> 当一个对象变化时，其 它依赖该对象的对象都会收到通知，并且随着变化!对象之间是一种一对多的关系。

