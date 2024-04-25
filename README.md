
# Craps Simulation

This Java program is part of my first project for the Data Structures class. It simulates the dice game craps 100,000 times to analyze the outcomes statistically, highlighting the balance between wins and losses based on the standard rules of craps.

## Features

- **Dice Simulation**: Utilizes Java's `Random` class to simulate the rolling of two dice.
- **Game Logic**: Adheres to the traditional craps rules:
  - A first roll of 2, 3, or 12 results in an immediate loss.
  - A first roll of 7 or 11 results in an immediate win.
  - Any other number sets a "point." The game continues with the player rolling until either the point is rolled again for a win, or a 7 is rolled for a loss.
- **Score Tracking**: Keeps a tally of wins and losses throughout the simulation.

## Usage

The main logic of the simulation is encapsulated in the `Craps` class. The `main` method triggers the simulation and reports the results.
## Example
- The number of wins in the game simulation was 49321
- The number of losses in the game simulation was 50679




### Prerequisites

- Java JDK 1.8 or later

### Running the Simulation

Compile and run the `Craps.java` file using the following commands:

```bash
javac Craps.java
java Craps
