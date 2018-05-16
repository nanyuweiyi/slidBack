# slidBack
侧滑返回

使用：

1、implementation 'com.github.nanyuweiyi:slidBack:1.0.0'

2、具体使用
```
@Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SlideBackLayoutUtils.sideBack(this);
    }

    @Override
    protected void onDestroy() {
        SlideBackLayoutUtils.onDestroy(this);
        super.onDestroy();
    }
    
    可以将这2句封装到BaseActivity中：
    SlideBackLayoutUtils.sideBack(this);
    SlideBackLayoutUtils.onDestroy(this);
```
