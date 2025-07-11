# Random Writing Text Generator

## Overview
A Java implementation of a Markov Chain-based text generator that creates pseudo-random text based on character sequence patterns from a source text. The program analyzes character frequencies at different levels to produce increasingly English-like output as the analysis level increases.

## Features
- **Level k Analysis**: Analyzes patterns of k consecutive characters in source text
- **Random Text Generation**: Produces output text based on probability distributions from the source
- **Configurable Output**: User-specified analysis level and output length
- **Error Handling**: Validates input parameters and provides informative error messages

## Implementation Details

### Core Components
- Implements the `TextProcessor` interface
- `readText()`: Reads and processes the input file
- `writeText()`: Generates output based on seed patterns
- Main method handles command-line arguments and validation

### Algorithm
1. Selects random k-character seed from source text
2. Finds all occurrences of seed in source
3. Randomly selects next character based on probability distribution
4. Updates seed by removing first character and appending new character
5. Repeats until desired output length is reached

## Usage
Command-line arguments (in order):
1. Input filename (source text)
2. Output filename (generated text)
3. Level of analysis (k)
4. Length of output

## Testing Approach
- **Black Box Testing**: Validated command-line argument handling and error messages
- **White Box Testing**: Verified internal methods and data structures
- **Edge Cases**: Handled scenarios where output length exceeds input length and empty seed matches

## Social Impact
Text generation technology has significant implications:
- **Educational Benefits**: Helps language learners understand sentence structure
- **Communication Enhancement**: Assists with text prediction and autocomplete
- **Privacy Concerns**: Data storage and user text patterns raise ethical considerations
- **Potential Misuse**: Risk of generating misleading or harmful content

## Results Examples
- **Level 0-2**: Random character sequences with minimal structure
- **Level 4-6**: Recognizable word fragments and phrases
- **Level 8-10**: Nearly coherent English sentences

Tested with various sources including Taylor Swift lyrics and Hindi songs, demonstrating the algorithm's language-agnostic nature.

## Limitations
- No graphical user interface
- Command-line interface requires technical knowledge
- Assumes non-empty input files
- Quality depends heavily on source text and analysis level

## Author
Smruti Sannabhadti