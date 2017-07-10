graph = {'A': set(['B', 'C']),
         'B': set(['A', 'D', 'E']),
         'C': set(['A', 'F']),
         'D': set(['B']),
         'E': set(['B', 'F']),
         'F': set(['C', 'E'])}

def breadthFirstSearch(graph):
    queue = ['A'] # queue - first in, first out
    visitedNodes = set()

    while len(queue) > 0: # repeat until the queue is empty
        lastNode = queue.pop(0) # get the very last node

        if lastNode not in visitedNodes: # see if the node is visited
            visitedNodes.add(lastNode) # mark the node as visited

            for node in graph.get(lastNode): # get all the children of the node
                queue.append(node) # add it to the queue to visit later

    return visitedNodes # return all of the nodes visited

def depthFirstSearch(graph):
    stack = ['A'] # stack - first in, last out
    visited = {}

    for key in graph.keys(): # initialize the list of visited nodes
        visited = set()

    visited.add('A') # mark the vertex as visited

    while (len(stack) > 0): # repeat until the stack is empty
        startVertex = stack.pop(len(stack) - 1) # get the vertex from the stack

        for neighbor in graph.get(startVertex): # go through all the neighbors
            if neighbor not in visited: # if the neighbor is not visited
                stack.append(neighbor) # add it to the stack
                visited.add(neighbor) # mark the neighbor as visited

    return visited # return whether all nodes have been visited or not
 
print(depthFirstSearch(graph))
