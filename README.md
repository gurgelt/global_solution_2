# Global Solution 2 - Deploy APP em Nuvem
Global Solution - DevOps - Deploy App em Nuvem Utilizando Portal Azure (NoLine)

# Codigos - Terminal (Portal Azure)

az group create --name gs-bcosql --location brazilsouth

az sql server create -l brazilsouth -g gs-bcosql -n sqlserver-rm88960 -u admsql -p global123@ --enable-public-network true

az sql db create -g gs-bcosql -s sqlserver-rm88960 -n globaldb --service-objective Basic --backup-storage-redundancy Local --zone-redundant false

az sql server firewall-rule create -g gs-bcosql -s sqlserver-rm88960 -n AllowAll --start-ip-address 0.0.0.0 --end-ip-address 255.255.255.255

# Codigos - Banco (MySQL)

CREATE TABLE [dbo].[tb_transaction] (
id BIGINT NOT NULL IDENTITY,
date DATETIME NOT NULL, description VARCHAR(120) NOT NULL, type VARCHAR(255) NOT NULL,
value DECIMAL(19,2) NOT NULL, user_id BIGINT NOT NULL, PRIMARY KEY (id)
);

CREATE TABLE [dbo].[tb_user] (
id BIGINT NOT NULL IDENTITY, balance DECIMAL(19,2) NOT NULL, name VARCHAR(255) NOT NULL, PRIMARY KEY (id)
);

ALTER TABLE [dbo].[tb_transaction] ADD CONSTRAINT FK_USER_TRANSACTION FOREIGN KEY (user_id) REFERENCES [dbo].[tb_user] (id);

# Descricoes e teste de persistencia

globalRM88960
Linux Java 11

globalSol
Brazil South
F1

gs-bcosql

select * from tb_user;
