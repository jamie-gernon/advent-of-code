```mermaid
classDiagram
    Move <|-- Rock
    Move <|-- Paper
    Move <|-- Scissors

    class Move{
        +winsAgainst()
        +losesAgainst()
        +drawsAgainst()
    }
    
```