# Choose ubuntu version
FROM mcr.microsoft.com/mssql/server:2022-latest

WORKDIR /usr/src/app

COPY . /usr/src/app
             

ENV SA_PASSWORD Bla12345
ENV ACCEPT_EULA Y
ENV MSSQL_PID Express

# Expose port 1433 in case accessing from other container
# Expose port externally from docker-compose.yml
EXPOSE 1433

# Run Microsoft SQL Server and initialization script (at the same time)
CMD /bin/bash ./entrypoint.sh