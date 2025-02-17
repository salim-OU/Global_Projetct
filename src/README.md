# Projet Menu de Calculs et Fonctions Diverses

Ce projet Java propose un menu interactif permettant à l'utilisateur de choisir parmi plusieurs options. Le programme effectue des calculs simples, propose des interactions avec l'utilisateur, et effectue diverses fonctions comme le calcul de l'IMC, l'obtention de l'âge, la préparation d'une fondue, etc.

## Structure du projet

Le projet est organisé comme suit :
project/ │ 
├── src/ # Dossier contenant tous les fichiers Java │ 
├── Menu.java # Contient le menu principal et les choix de l'utilisateur │ 
├── IMC.java # Classe pour le calcul de l'IMC │ 
├── AgeEtNaissance.java # Classe pour calculer l'âge de l'utilisateur │ 
├── Fondue.java # Classe pour préparer une fondue │ 
├── degré 3.java # Classe pour résoudre un polynôme de degré 3 │ 
├── Swap3.java # Classe pour effectuer une permutation de 3 variables │
├── Permutation.java # Classe pour effectuer une permutation de 2 variables │ 
├── RosesBlanches.java # Classe pour afficher un message romantique (exemple : roses blanches)
└── README.md # Ce fichier de documentation.


## Utilisation du programme

1. Lancez le programme Java.
2. Le menu interactif sera affiché dans la console.
3. Choisissez une option en entrant le numéro correspondant.
4. Suivez les instructions à l'écran pour chaque option.
5. Le programme exécute l'option choisie et affiche le résultat.

## Structure des fichiers

Les fichiers du projet sont organisés dans un dossier **src/**, qui contient tous les fichiers Java nécessaires pour exécuter les différentes options. Pour exécuter le programme, compilez simplement tous les fichiers Java et lancez **Menu.java**.


## Fonctionnalités

### 1. **Calculer l'IMC** (IMC.java)
Cette fonctionnalité permet à l'utilisateur de calculer son 
**IMC** (Indice de Masse Corporelle) en entrant son poids et sa taille. 
Le programme calcule l'IMC et affiche une interprétation basée sur le résultat 
(insuffisance pondérale, poids normal, surpoids, obésité).


### 2. **Obtenir l'âge** (CalculAge.java)
Cette option permet à l'utilisateur de calculer son âge actuel
en fonction de son année de naissance. Le programme lui demande d'entrer 
son année de naissance, puis calcule et affiche son âge.

### 3. **Préparer la fondue** (Fondue.java)
Cette option fournit une recette pour préparer une fondue.
Elle pourrait afficher la liste des ingrédients nécessaires et donner 
les étapes de préparation.


### 4. **Calculer un polynôme de degré 3** (Degre3.java)
Cette option permet à l'utilisateur de résoudre un polynôme de 
degré 3 de la forme `ax^3 + bx^2 + cx + d = 0`. L'utilisateur entre 
les coefficients et le programme affiche les racines du polynôme.

### 5. **Swap3** (Swap3.java)
Cette fonctionnalité effectue une permutation de trois variables. 
L'utilisateur entre trois valeurs, et celles-ci sont échangées selon 
une logique définie (par exemple, permutation circulaire).

### 6. **Permutation** (Permutation.java)
Cette option permet à l'utilisateur de permuter deux variables. 
Après avoir saisi deux valeurs, elles sont échangées et affichées à l'écran.


### 7. **RosesBlanches** (RosesBlanches.java)
Cette option affiche un message romantique ou poétique. Par exemple, 
un message sur les roses blanches, qui symbolisent la pureté.


### 8. **Quitter**
Cette option permet de quitter le programme proprement en affichant
un message de départ.


## Exécution du projet

Pour exécuter ce projet :

1. **Compilez les fichiers Java** :
    - Si vous utilisez un IDE (comme IntelliJ IDEA ou Eclipse), vous pouvez simplement exécuter le fichier `Menu.java`.
    - Sinon, vous pouvez compiler tous les fichiers Java via la ligne de commande avec la commande suivante :
      ```bash
      javac *.java
      ```

2. **Exécutez le programme** :
    - Lancez le programme en exécutant la classe `Menu.java` :
      ```bash
      java Menu
      ```

Le programme démarrera et affichera le menu avec les options. Vous pourrez alors entrer le numéro correspondant à l'option que vous souhaitez utiliser.

## Exemple d'usage du menu

Lors de l'exécution, le menu apparaîtra dans la console avec les options suivantes :
Calculer IMC
Obtenir l'âge
Préparer la fondue
Calculer un polynôme de degré 3
Swap3
Permutation
RosesBlanches
Quitter


L'utilisateur choisira l'option désirée en entrant le numéro correspondant.

## Contribution

Si vous souhaitez améliorer ou ajouter des fonctionnalités à ce projet, vous êtes les bienvenus pour contribuer ! Voici comment procéder :

- Forkez le projet
- Clonez votre fork sur votre machine locale
- Créez une nouvelle branche pour votre fonctionnalité ou correction
- Soumettez une **Pull Request** avec votre ajout ou correction

## Auteurs

- Salim


---

## Licence

Ce projet est sous licence [MIT ].








