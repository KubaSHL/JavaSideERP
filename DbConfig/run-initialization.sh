sleep 15s

/opt/mssql-tools18/bin/sqlcmd -S localhost -U sa -P Bla12345 -d master -i create-database.sql -C -N