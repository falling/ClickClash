处理ListView的Item与Item里的Button的点击事件冲突的方法有两种：

1.Item屏蔽子元素获取焦点：
   Item的根布局那加入下面这行语句
              android:descendantFocusability="blocksDescendants"
              
2.将Button控件设置获取焦点为false：
              android:focusable="false"

