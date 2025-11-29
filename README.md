# Learn Java

A structured collection of Java programs covering fundamental programming concepts. Each example is designed to demonstrate core Java features through practical, runnable code.

## Topics Covered

### Introduction

- **HelloWorld** - Basic output and program structure
- **Variables** - Variable declaration and data types
- **UserInput** - Reading input with Scanner
- **Math** - Mathematical operations and calculations
- **Casting** - Type conversion and casting
- **FormattedOutput** - String formatting and output

### Conditionals

- **Conditionals** - If-else statements and decision making

### Loops

- **Loops** - For, while, and do-while loops
- **Nested** - Nested loop patterns

### Methods

- **Methods** - Function definition and calling

### Arrays

- **Arrays** - Array creation, manipulation, and iteration
- **Dimensions** - Multi-dimensional arrays
- **Grid** - Working with 2D arrays and grids

### Problems

- **Nums** - Practice problems and exercises

### Projects

- **Workouts** - Workout tracking application

## Quick Start

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Make (for using the Makefile)

### Running Examples

Each example can be run using the provided Makefile commands:

```bash
# Introduction examples
make hello          # Hello World program
make variables      # Variable examples
make input          # User input example
make calc           # Math operations
make cast           # Type casting
make format         # Formatted output

# Conditionals
make condition      # If-else statements

# Loops
make loops          # Loop examples
make nested         # Nested loops

# Methods
make methods        # Method examples

# Arrays
make arrays         # Array examples
make ds             # Multi-dimensional arrays
make grid           # 2D array grids

# Problems
make nums           # Practice problems

# Projects
make project        # Workout tracking app
```

### Cleaning Up

Remove all compiled `.class` files:

```bash
make clean
```

## Learning Path

Recommended order for beginners:

1. Start with `introduction/` - Learn the basics
2. Move to `conditionals/` - Understand decision making
3. Practice `loops/` - Master iteration
4. Explore `methods/` - Write reusable code
5. Work with `arrays/` - Handle collections of data
6. Try `problems/` - Apply what you've learned
7. Build `projects/` - Create complete applications

## Development

### Adding New Examples

1. Create a new `.java` file in the appropriate directory
2. Add a corresponding Makefile target
3. Follow the package naming convention (package name = directory name)

### Code Style

- Each file is self-contained with a `main` method
- Packages match directory names
- Clear, educational code with minimal complexity
- Interactive examples use `Scanner` for input
