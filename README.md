# scolarite-config

Pour Tester:

http://localhost:9999/application/defaut
il donnera les paramaètres globaux

http://localhost:9999/etudiant-service/defaut
http://localhost:9999/etudiant-service/dev
http://localhost:9999/etudiant-service/prod


Changer la configuration d'un service et tester à nouveau
N'oublier pas de  faire init add .  commit et push (car on utilise github).

Pour tester à chaud la configuation d'un service
envoyer lui la requete: soit avec POSTMAN soit un client http dans Intellij.
POST http://localhost:7070/actuator/refresh
Accept: application/json
ET dans ce cas pas besoin de réexcéuter les service en question.


