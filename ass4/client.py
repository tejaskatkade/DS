import socket

class BerkeleyClient:
    def __init__(self, server_address, port):
        self.server_address = server_address
        self.port = port
        self.client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

    def synchronize(self):
        self.client_socket.connect((self.server_address, self.port))
        data = self.client_socket.recv(1024).decode()
        offset = float(data)
        print(f"Offset received from server: {offset}")

# Example usage
client = BerkeleyClient('localhost', 12345)  # Replace 'localhost' and 12345 with server's IP and port
client.synchronize()


