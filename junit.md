# JUnit 6.0.0

## To install JUnit 6.0.0

1. Go to this page:  
   https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/6.0.0/

2. Download this file:

```text
junit-platform-console-standalone-6.0.0.jar
```

3. Place the file in the `lib` directory of your project.

Example project structure:

```text
project/
├── lib/
│   └── junit-platform-console-standalone-6.0.0.jar
├── src/
└── bin/
```

## Notes
* JUnit 6.0.0 jar is in the `lib` directory.
* No dependency manager is required.

---

# VS Code Setup

## Install the Java Extension Pack

In VS Code, install:

```text
Extension Pack for Java
```

This gives VS Code Java language support, compiling, running, and testing support.

## Add JUnit jar to VS Code

Create this file if it does not already exist:

```text
.vscode/settings.json
```

Add this:

```json
{
  "java.project.referencedLibraries": [
    "lib/**/*.jar"
  ]
}
```

Or, if you want to list the exact jar:

```json
{
  "java.project.referencedLibraries": [
    "lib/junit-platform-console-standalone-6.0.0.jar"
  ]
}
```

## Refresh VS Code Java Project

After adding the jar:

1. Open the Command Palette:

```text
Ctrl + Shift + P
```

or on Mac:

```text
Cmd + Shift + P
```

2. Run:

```text
Java: Clean Java Language Server Workspace
```

3. Restart VS Code when prompted.

## Running JUnit Tests in VS Code

After the jar is referenced correctly, VS Code should show test buttons above test methods and test classes.

If VS Code does not show test buttons, run the tests manually from the terminal using the commands below.

---

# IntelliJ Setup

## Add the JUnit jar manually

1. Open the project in IntelliJ.
2. Go to:

```text
File > Project Structure
```

3. Go to:

```text
Libraries
```

4. Click:

```text
+
```

5. Choose:

```text
Java
```

6. Select:

```text
lib/junit-platform-console-standalone-6.0.0.jar
```

7. Click:

```text
Apply
```

8. Click:

```text
OK
```

## Mark the src folder as Sources Root

If IntelliJ does not recognize your Java files correctly:

1. Right-click the `src` folder.
2. Choose:

```text
Mark Directory as > Sources Root
```

## Running JUnit Tests in IntelliJ

Once the jar is added, IntelliJ should show green run buttons next to test classes and test methods.

Click the green run button next to the test method or class.

---

# To Compile

Compile all `.java` files in `src`:

```bash
javac src/*.java -cp "lib/*" -d bin
```

If your files are in packages or subfolders, use:

```bash
javac $(find src -name "*.java") -cp "lib/*" -d bin
```

---

# To Discover Tests

```bash
java -jar lib/junit-platform-console-standalone-6.0.0.jar discover --class-path bin --scan-class-path
```

Or:

```bash
java -jar lib/* discover --class-path bin --scan-class-path
```

---

# To Run Tests

```bash
java -jar lib/junit-platform-console-standalone-6.0.0.jar execute --class-path bin --scan-class-path
```

Or:

```bash
java -jar lib/* execute --class-path bin --scan-class-path
```

---


