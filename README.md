# IndicatorView
[![Build Status](https://travis-ci.org/Kshitij-Jain/IndicatorView.svg?branch=master)](https://travis-ci.org/Kshitij-Jain/IndicatorView)
[![](https://jitpack.io/v/Kshitij-Jain/IndicatorView.svg)](https://jitpack.io/#Kshitij-Jain/IndicatorView)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-IndicatorView-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/5337)

A simple library to add indicators for your Carousel or ViewPagers.

<img src="https://github.com/Kshitij-Jain/IndicatorView/blob/master/Screenshots/screen_1.png" width="512">

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
    compile 'com.github.Kshitij-Jain:IndicatorView:1.2'
}

```

##### Maven

```
<dependency>
    <groupId>com.github.Kshitij-Jain</groupId>
    <artifactId>IndicatorView</artifactId>
    <version>1.2</version>
</dependency>
```

### Usage

#### Include following code in your layout:

```
<io.github.kshitij_jain.indicatorview.IndicatorView
            android:id="@+id/circle_indicator_view"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerInParent="true"
            android:layout_gravity="center"/>
```

#### Include following code in your activity:

```
IndicatorView mIndicatorView = (IndicatorView) findViewById(R.id.circle_indicator_view);
mIndicatorView.setPageIndicators(4);
mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
       @Override
       public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
       }

       @Override
       public void onPageSelected(int position) {
            mIndicatorView.setCurrentPage(position);
       }

       @Override
       public void onPageScrollStateChanged(int state) {
       }
});
```
##### Supported xml attributes:
```
 app:activeColor="@color/colorPrimary" // Set Active Indicator Color
 app:inactiveColor="@color/colorAccent" // Set Inactive Indicator Color
 ``` 

##### Other supported methods:

```
 mIndicatorView.setActiveIndicatorColor(R.color.colorAccent); // Set Active Indicator Color
 mIndicatorView.setInactiveIndicatorColor(R.color.colorPrimary); // Set Inactive Indicator Color
 ``` 
### License
```
Copyright 2017 Kshitij Jain

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
