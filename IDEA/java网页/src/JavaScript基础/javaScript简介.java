package JavaScript基础;

/**
 * @author yt13yt
 * @create 2019-12-20 18:32
 */
/*
JavaScript:
    概念：一门客户端脚本语言
        运行在客户端的浏览器中，每一个浏览器都有javascript的解析引擎
        脚本语言：不需要编译，直接就可以被浏览器解析执行了
    功能：
        可以增强用户与html页面的交互过程，可以让页面加上动态效果，增强用户体验
    javascript的发展历史：
    JavaScript=ECMAScript+BOM+DOM

    ECMAScript:客户端脚本语言的标准
        1.基本语法
            1.JavaScript与html的结合方式
                1.内部JS
                2.外部JS
    <!--
    1.内部JS
        在页面的任何位置使用<script></script>标签
    2.外部JS
        使用script标签，使用src去加载外部的js文件
    -->
                注意：<script>标签可以定义在任意位子
                      <script>标签可以定义多个
            2.注释
                1.单行注释
                    //注释内容
                2.多行内容
                    /*多行注释*/



   /*
            3.数据类型
                1.原始数据类型（基本数据类型）
                    五种：
                    1，num(数字)
                        整数，小数，NaN （not a number 一个不是数字的数字类型）

                    2.string（字符串）
                        "abc" , 'acsdf';

                    3.boolean true或false
                    4.null 空
                    5.undefined
                        未定义，一个变量没有初始化值，则被默认赋值为undefined
                2.引用数据类型（对象）

            4.变量的定义
                变量：一小块存储数据的一片数据空间
                java是强类型的编程语言，JavaScript是弱类型的语言
                定义变量的语法：
                    var 变量名=初始值;

            5.运算符
                1.一元运算符
                ++，--，+3；
                2.算术运算符
                +，-，*，/，%；
                3.复制运算符
                =,+=,*=
                4,比较运算符
                <,>,<=,==,===(全等于)
                ===在比较前要进行类型的比较，类型不同，直接返回
                5.逻辑运算符
                &&，||，！，
                6，三元运算符
                    ?:
                7.特殊的语法
                1.语句以分号结尾，如果一行只有一句，则分号可以不写
                var a=3
                alert(a)

                2.变量的定义使用var，也可以不使用
                var b=4;
                用于不用的区别，用var是局部变量
                              不用var是全局变量




            6.流程控制语句
            if else
            switch
            while
            do while
            for
        2.基本对象
            Array
            1，

            Date
            Math
            Number
            String
            RegExp
            Dlobal
            Functon:函数对象




      今日内容：
      1.ECMAScript:
      2.BOM
      3.DOM
        1.事件
      DOM简单学习：为了满足案例要求
        功能：控制html文档的内容
        代码：获取页面的标签对象（元素） Elememnt
        document.getElementById("id值")：通过元素的id获取元素的对象

        操作Elememt对象：
            1.设置属性值
            2.修改标签内容

      事件的简单学习
            概念：某一些组件被执行了某些操作去触发某些代码的执行
      绑定事件的方式
            1.直接在html标签上，指定事件的属性，属性值就是js代码
              1.事件：onclick();
              2.通过js获取元素对象，指定事件属性，设置

BOM
    概念：浏览器对象模型
    将浏览器的各个部分分为一个个对象
    浏览器对象Navigator：
    浏览器窗口对象Window：
    地址栏对象Location：
    浏览器历史记录对象History：
    显示器对象Screen：
    DOM对象 document；

DOM
    概念：文档对象模型
    将标记语言文档的各个部分封住成为对象，对标记语言文档进行crud的动态操作

    html根元素
        head
         title文本
        body
         <a>链接
            href属性
         <h1>文本

    w3c将DOM标准被分为3个不同的部分
        核心 DOM 针对任何结构化文档的标准模型
            document：文档对象
            Element：元素对象
            Attribute：属性对象
            Comment：注释对象
            Node:节点对象
        xml DOM 针对xml文档的标准模型
        html DOM 针对html文档的标准模型

    核心DOM模型
        Document：文档对象
            1.获取在html dom模型中的可以使用window对象来获取
                1.window.document
                2.document
            2.方法
                1.获取element元素
                    getElementById();根据id来获取对象，id属性值一般唯一
                    getElementByTagName();根据元素名称获取元素对象，一般返回数组
                    getElementByClassName();根据class属性值获取元素对象，一般返回数组
                    getElementByName();根据name属性值获取元素对象，一般返回数组
                2.创建其他dom对象
                    creatAttribute()
                    createComment()
                    createElement()
                    createTextNode()

            3.属性
            Element:元素对象
                1.获取/创建通过document来获取和创建
            方法：
                1.removeAttribute():删除属性
                2.setAttribute():设置属性
            Node：节点对象，其他5个的父对象
                特点：所有的dom对象都可以被认为是一个节点
                方法：
                    CRUDdom树
                    1.添加 appendChild():向节点的子节点列表的结尾添加新的子节点
                    2.removeChild();删除但当前节点的子节点
                    3.replaceChild();用新节点替换一个子节点
                属性：
                    parentNode 返回节点的父节点


                动态表格案例


              1.事件
              概念：某些组件被执行某些操作后触发某一些代码的执行
                   事件：某一操作，如单击，双击
                   事件源：组件 如按钮，文本输入框。。。
                   监听器：代码
                   注册监听：将事件源，监听器结合在一起，当事件源上发生了某一些事件，则触发执行某一个监听代码


              常见的事件：
                1.点击事件
                    onclick：单击事件
                    ondblclick:双击事件
                2.焦点事件
                    onblur 失去焦点
                    onfocus:元素始取事件

                3.加载事件
                    onload 图片被加载完成事件

                4.鼠标事件
                    onmousedown
                    onmouseup
                    onmousemove
                    onmouseout
                5.键盘事件
                    onkeydown
                    onkeyup
                    onkeypress
                6.选择中可改变
                    onchanege
                    onselect

                7.表单事件
                    onsubmit
                    onreset





*/



