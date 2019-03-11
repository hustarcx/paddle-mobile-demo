# PaddleMobile_Android
`多种模型的测试demos`
## ANDROID CPU DEMO 使用说明
android cpu demo 演示了Paddle Mobile 在Android平台上粗分类的应用.

### 编译步骤
1. clone 仓库
2. 打开Android Studio
3. "open an existing Android Studio Project"
4. 目录中选择 paddle-mobile-demo/android/CPU/paddle_mobile_android/
5. run and enjoy it


## 主要类说明

``` java
 /**
 * 描述一个模型的 预处理, 加载, 以及预测等特性
 * 封装了与paddle mobile - PML 交互过程 
 */
abstract class Model : IModel, AnkoLogger{}


/**
 * DEMO的界面, 创建与调用Model对象,
 * XxxModelImpl用于描述一个模型的输入预处理, 模型加载 及预测等
 */
class MainActivity : Activity(){}


/**
 * MobileNetModelImpl 描述了一个modelnet分类模型
 * 包含预处理,模型加载,预测过程等
 **/
class MobileNetModelImpl : Model() {}
```

