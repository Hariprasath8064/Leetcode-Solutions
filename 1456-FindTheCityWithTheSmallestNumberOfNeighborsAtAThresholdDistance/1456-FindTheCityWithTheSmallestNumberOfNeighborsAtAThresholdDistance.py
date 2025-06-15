# Last updated: 6/15/2025, 5:28:38 PM
class Solution:
    def findTheCity(self, n, edges, distanceThreshold):
        # Initialize the distance matrix
        dist = [[float('inf')] * n for _ in range(n)]
        
        # Distance from a city to itself is 0
        for i in range(n):
            dist[i][i] = 0
        
        # Set the direct distances from the edges
        for u, v, w in edges:
            dist[u][v] = w
            dist[v][u] = w
        
        # Apply Floyd-Warshall algorithm to find shortest paths
        for k in range(n):
            for i in range(n):
                for j in range(n):
                    if dist[i][j] > dist[i][k] + dist[k][j]:
                        dist[i][j] = dist[i][k] + dist[k][j]
        
        # Find the city with the smallest number of reachable cities within the distance threshold
        minReachableCities = float('inf')
        bestCity = -1
        
        for i in range(n):
            reachableCities = 0
            for j in range(n):
                if dist[i][j] <= distanceThreshold:
                    reachableCities += 1
            
            # Update bestCity if a new city with fewer reachable cities is found
            # In case of a tie, prefer the city with the larger index
            if reachableCities <= minReachableCities:
                minReachableCities = reachableCities
                bestCity = i
        
        return bestCity
