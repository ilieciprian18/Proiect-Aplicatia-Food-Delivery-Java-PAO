# Proiect-Aplicatia-Food-Delivery-Java-PAO

**Aplicatia contine un meniu ce poate accesta toate operatiile acesteia ( cu input de la tastatura).**\
**Meniul acceseaza metode implementate in clasele de tip Service.**\
**De asemenea aplicatia deja contine un set de date, la care se pot adauga date noi.**\
_De asemenea tot codul contine comentarii sugestive_

## 8 obiecte modele, 9 clase
 - Person
 - DateOfBirth
 - User
 - Livrator
 - Magazin
 - Comanda
 - Masina
 - Produs
 - Ingrediente
 
## Clase service:
 - MasinaService
 - RestaurantService
 - LivratorService
 - UserService
 - ComandaService
 - DateofBirthService
 - ProdusService (nefolosita)
 
 ## Comenzi:
 - Cautare restaurant
 - Cautare restaurant in oras
 - Afisare total pret o comanda
 - Afisare total comenzi user
 - Afisare istoric comeenzi user
 - Afisare istoric comenzi livrate de curier
 - Afisare sum totala aplicatie
 - Afisare profit restaurant
 - Afisam numar restaurante in oras
 - Aflati utilizatorii a caror zi este astazi
 - Add stuff / remove stuff
 - Diferite Afisuri


# Etapa II
**Am implementat servicii generice Singleton pentru citirea datelor de intrare din fisiere CSV pentru clasele:DateOfBirth,User,Livrator,Masina (4 clase).**\
**Am realizat un Serviciu de Audit ce scrie intr-un fisier CSV extern**

# Etapa III
**Am creeat o baza de date pentru aplicatie in care se incarca datele folosing MySQL**\
**Se creeaza baza de date, exemplele de JBDC se afla in fisierul SQLConnect.java**\
**Exista in aplicatie comenzi crude insert,update,delete,read pe tabele**\
**Am implementat urmatoarele clase in baza de date:birthday, user, masina, livrator, produs, restaurant + un audit log**
