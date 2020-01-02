# Android Client ID Library Kotlin

## Add Library to Android Project

- Trong `settings.gradle`:

  ```gradle
  include ':androidclientid'
  project(':androidclientid').projectDir = new File('AndroidClientID/androidclientid')
  ```

  - Trong `build.gradle (app)`:

  ```gradle
  implementation project(path: ':androidclientid')
  ```
