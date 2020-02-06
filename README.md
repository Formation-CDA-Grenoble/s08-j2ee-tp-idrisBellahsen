# Travaux pratiques: Spring API

Nos intégrateurs nous ont mis en place une belle application React (dans le dossier **client**) pour le blog de notre école. Le problème, c'est que pour l'instant l'application fonctionne à partir de données écrites "en dur" dans les fichiers .js de l'application. Ta mission, si tu l'acceptes, est de relier cette application à une vraie base de données.

## 1. Modéliser la base de données

Lance l'application et observe les fichiers dans le dossier **client/data**. A l'aide de PHPMyAdmin (ou de ton client SQL préféré), mets en place une base de données capable de prendre la place de ces fichiers, et remplis-la avec quelques données aléatoires pour pouvoir tester son bon fonctionnements dans l'application, plus tard.

## 2. Créer un CRUD pour les entités de la base de données

En t'inspirant du code écrit en cours, crée les fichiers nécessaires dans l'application Spring qui se trouve dans le dossier **api**, de sorte à pouvoir exploiter toutes les ressources de la base de données crée à l'étape précédente.

## 3. Lire les données de l'API dans l'application client

Crée les composants nécessaires dans l'application client afin que celle-ci puisse récupérer les ressources de la base de données, à travers l'API codée à l'étape précédente. Réfléchis bien à quelle donnée est nécessaire en fonction du contexte.

## 4. Ajouter les applaudissements

Notre cahier des charges prévoit que les visiteurs puissent "applaudir" pour féliciter l'auteur d'un article. Lorsqu'un utilisateur (n'importe lequel) clique sur le bouton "applaudissement", cela doit augmenter le nombre d'applaudissements de cet article de 1 dans la base de données; et le nombre d'applaudissements doit se mettre à jour sur le bouton. Un même utilisateur peut cliquer autant de fois qu'il le souhaite sur le bouton "applaudissement".

Code une nouvelle méthode dans le contrôleur approprié pour mettre en place cette fonctionnalité, et appelle-la dans l'application client.
