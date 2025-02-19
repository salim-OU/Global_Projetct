# Menu Interactif Java

Application Java proposant un menu interactif avec diverses fonctionnalités de calcul et d'utilitaires.

![Java](https://img.shields.io/badge/Java-8%2B-orange)
![License](https://img.shields.io/badge/License-MIT-blue)

## Description

Cette application propose une interface utilisateur en ligne de commande permettant d'accéder à diverses fonctionnalités mathématiques et utilitaires. Elle est conçue pour démontrer l'implémentation de différents algorithmes et calculs en Java.

## Fonctionnalités

L'application propose les fonctionnalités suivantes :

1. **Calculer IMC**
   - Calcul de l'Indice de Masse Corporelle
   - Entrées : poids (kg) et taille (m)

2. **Obtenir l'âge**
   - Calcul de l'âge à partir de la date de naissance
   - Format de date attendu : JJ/MM/AAAA

3. **Préparer la fondue**
   - Instructions détaillées pour la préparation d'une fondue
   - Calcul des quantités d'ingrédients

4. **Calculer un polynôme de degré 3**
   - Évaluation de P(x) = ax³ + bx² + cx + d
   - Entrées : coefficients a, b, c, d et valeur de x

5. **Swap3**
   - Échange des valeurs entre trois variables
   
6. **Permutation**
   - Échange de position entre deux éléments d'une liste

7. **RosesBlanches**
   - Fonctionnalité spécifique (implémentation personnalisée)

8. **Quitter**
   - Termine l'exécution du programme

## Structure du projet

```
/projet-menu-interactif
│
├── src/
│   ├── Main.java          # Menu principal
│   ├── CalculIMC.java     # Calcul IMC
│   ├── AgeCalculator.java # Calcul d'âge
│   ├── FondueRecipe.java  # Recette fondue
│   ├── Polynomial.java    # Calcul polynôme
│   ├── Swap3.java         # Échange triple
│   ├── Permutation.java   # Permutation
│   └── RosesBlanches.java # Module spécifique
│
├── README.md
└── LICENSE
```

## Prérequis

- JDK 8 ou version supérieure
- IDE Java (IntelliJ IDEA, Eclipse, NetBeans) ou éditeur de texte
- Connaissance basique de la ligne de commande

## Installation

1. Cloner le repository
```bash
git clone https://github.com/votre-utilisateur/projet-menu-interactif.git
```

2. Accéder au répertoire
```bash
cd projet-menu-interactif
```

3. Compiler le projet
```bash
javac src/*.java
```

4. Exécuter l'application
```bash
java src.Main
```

## Utilisation

1. Lancer l'application
2. Sélectionner une option du menu en entrant le numéro correspondant
3. Suivre les instructions à l'écran pour chaque fonctionnalité
4. Sélectionner l'option "Quitter" pour terminer le programme

## Licence

Ce projet est sous licence MIT. Voir le fichier `LICENSE` pour plus de détails.

## Contact

Nom : Oujjet 

Projet: [https://github.com/votre-utilisateur/projet-menu-interactif](https://github.com/votre-utilisateur/projet-menu-interactif)
