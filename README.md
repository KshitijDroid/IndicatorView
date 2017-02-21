# IndicatorView

A simple library to add indicators for your Carousel or ViewPagers.

### 

### Download

#### Step 1. Add the JitPack repository to your build file

##### Gradle

Add it in your root build.gradle at the end of repositories:

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}

```

##### **Maven**

```
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

#### **Step 2.** Add the dependency

##### Gradle

```
dependencies{
    compile 'com.github.Kshitij-Jain:IndicatorView:1.0'
}

```

##### Maven

```
<dependency>
    <groupId>com.github.Kshitij-Jain</groupId>
    <artifactId>IndicatorView</artifactId>
    <version>1.0</version>
</dependency>
```

### Usage

```
<io.github.kshitij_jain.indicatorview.IndicatorView
            android:id="@+id/circle_indicator_view"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerInParent="true"
            android:layout_gravity="center"/>
```



