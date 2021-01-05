## Breadth-First-Search

Breadth First Search (BFS) algorithm traverses a graph in a breadthward motion and uses a queue to remember to get the next vertex to start a search, when a dead end occurs in any iteration.

There are 3 main rules we need to fallow while working with BFS
  - **Rule 1** − Visit the adjacent unvisited vertex. Mark it as visited. Display it. Insert it in a queue
  - **Rule 2** − If no adjacent vertex is found, remove the first vertex from the queue
  - **Rule 3** − Repeat Rule 1 and Rule 2 until the queue is empty.

### Following graph is used for the code.

![alt text](https://github.com/lakith/Breadth-First-Search/blob/main/images/Capture.PNG)

### Output

```sh
Visited Vertex - A
Visited Vertex - B
Visited Vertex - F
Visited Vertex - G
Visited Vertex - C
Visited Vertex - D
Visited Vertex - H
Visited Vertex - E
```
