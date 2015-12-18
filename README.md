# sdkcheck
What version of Android is your user running?

Replaces checks like: 

```java
if(android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
  ...
}
```

with:

```java
if(Sdk.isAtLeastLollipop()){
  ...
}
```

# Examples:

```java
//com.akodiakson.sdk.simple.Sdk
public void example(){
        if(Sdk.isAtLeastMarshmallow()){
            System.out.println("I'm fluffy");
        } else if(Sdk.isAtLeastLollipop()){
            System.out.println("I'm sticky");
        } else if(Sdk.isAtLeastKitKat()){
            System.out.println("I'm crunchy");
        }
}
```

Non-static variant (more test-friendly):
```java
//com.akodiakson.sdk.Sdk
public void example(){
        Sdk sdk = new SdkImpl();
        if(sdk.isAtLeastMarshmallow()){
            System.out.println("I'm fluffy");
        } else if(sdk.isAtLeastLollipop()){
            System.out.println("I'm sticky");
        } else if(sdk.isAtLeastKitKat()){
            System.out.println("I'm crunchy");
        }
}
```

#Download

```groovy
maven { url "https://jitpack.io" }
```

```groovy
compile 'com.github.akodiakson:sdkcheck:0.2.2'
```
