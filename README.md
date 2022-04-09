# Repro steps

1. On a windows command prompt, run `gradlew build` and verify the project app builds sucessfully.
2. Rename the `JavaConsumptionOnly` directory to `javaConsumptionOnly` and run `gradlew clean && gradlew build`. Verify that the app still builds successfully.
3. Rename the `KotlinConsumptionOnly` directory to `kotlinConsumptionOnly` and run `gradlew clean && gradlew build`. At this point, you should see the application fail to build.

For some reason, the case of directory paths matters when performing class resolving during kotlin compilation on Windows. This is inconsistent with the java compilation behavior, and the fact that Windows uses a case-insensitve file system.