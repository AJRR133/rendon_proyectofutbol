
use("furboDB");
db.createCollection("registrousuarios")
db.registrousuarios.createIndex(
  { "id": 1 },
  { unique: true }
);
db.registrousuarios.insertMany([
  {
    "id": "1",
    "nombre": "Manolito Pérez",
    "correo_electronico": "manolito.perez@example.com",
    "recibir_notificaciones": true,
    "tiempo_maximo_uso_diario": 120.5,
    "direccion": {
      "calle": "Av. Del Aguila 123",
      "ciudad": "Alcala del rio",
      "codigo_postal": "41200",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "LaLiga", "equipo_favorito": "Sevilla"},
      {"liga": "Premier League", "equipo_favorito": "Arsenal"}
    ]
  },
  {
    "id": "2",
    "nombre": "Juan Pérez",
    "correo_electronico": "juan.perez@example.com",
    "recibir_notificaciones": false,
    "tiempo_maximo_uso_diario": 95.2,
    "direccion": {
      "calle": "Calle 80",
      "ciudad": "Sevilla",
      "codigo_postal": "30772",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Serie A", "equipo_favorito": "Roma"},
      {"liga": "Ligue 1", "equipo_favorito": "Lille"}
    ]
  },
  {
    "id": "3",
    "nombre": "Ana Gómez",
    "correo_electronico": "ana.gomez@example.com",
    "recibir_notificaciones": true,
    "tiempo_maximo_uso_diario": 110.7,
    "direccion": {
      "calle": "Calle 179",
      "ciudad": "Valencia",
      "codigo_postal": "28227",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Ligue 1", "equipo_favorito": "Lille"},
      {"liga": "Bundesliga", "equipo_favorito": "Leverkusen"},
      {"liga": "Serie A", "equipo_favorito": "Juventus"},
      {"liga": "Premier League", "equipo_favorito": "Chelsea"}
    ]
  },
  {
    "id": "4",
    "nombre": "Luis Martínez",
    "correo_electronico": "luis.martinez@example.com",
    "recibir_notificaciones": false,
    "tiempo_maximo_uso_diario": 75.3,
    "direccion": {
      "calle": "Calle 56",
      "ciudad": "Madrid",
      "codigo_postal": "83461",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Premier League", "equipo_favorito": "Manchester United"},
      {"liga": "LaLiga", "equipo_favorito": "Atlético de Madrid"}
    ]
  },
  {
    "id": "5",
    "nombre": "María López",
    "correo_electronico": "maria.lopez@example.com",
    "recibir_notificaciones": false,
    "tiempo_maximo_uso_diario": 130.9,
    "direccion": {
      "calle": "Calle 189",
      "ciudad": "Zaragoza",
      "codigo_postal": "25473",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Premier League", "equipo_favorito": "Liverpool"},
      {"liga": "Bundesliga", "equipo_favorito": "Eintracht Frankfurt"},
      {"liga": "Ligue 1", "equipo_favorito": "Lyon"}
    ]
  },
  {
    "id": "6",
    "nombre": "Carlos Sánchez",
    "correo_electronico": "carlos.sanchez@example.com",
    "recibir_notificaciones": false,
    "tiempo_maximo_uso_diario": 88.4,
    "direccion": {
      "calle": "Calle 178",
      "ciudad": "Barcelona",
      "codigo_postal": "95752",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Bundesliga", "equipo_favorito": "Leverkusen"},
      {"liga": "Ligue 1", "equipo_favorito": "PSG"}
    ]
  },
  {
    "id": "7",
    "nombre": "Laura Ruiz",
    "correo_electronico": "laura.ruiz@example.com",
    "recibir_notificaciones": false,
    "tiempo_maximo_uso_diario": 102.1,
    "direccion": {
      "calle": "Calle 60",
      "ciudad": "Valencia",
      "codigo_postal": "15941",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "LaLiga", "equipo_favorito": "Valencia CF"},
      {"liga": "Bundesliga", "equipo_favorito": "Leverkusen"}
    ]
  },
  {
    "id": "8",
    "nombre": "David Torres",
    "correo_electronico": "david.torres@example.com",
    "recibir_notificaciones": true,
    "tiempo_maximo_uso_diario": 115.6,
    "direccion": {
      "calle": "Calle 146",
      "ciudad": "Barcelona",
      "codigo_postal": "81965",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Serie A", "equipo_favorito": "AC Milan"},
      {"liga": "Bundesliga", "equipo_favorito": "Leipzig"},
      {"liga": "LaLiga", "equipo_favorito": "Valencia CF"}
    ]
  },
  {
    "id": "9",
    "nombre": "Elena Morales",
    "correo_electronico": "elena.morales@example.com",
    "recibir_notificaciones": false,
    "tiempo_maximo_uso_diario": 97.8,
    "direccion": {
      "calle": "Calle 179",
      "ciudad": "Madrid",
      "codigo_postal": "93351",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "LaLiga", "equipo_favorito": "Valencia CF"},
      {"liga": "Ligue 1", "equipo_favorito": "Lyon"}
    ]
  },
  {
    "id": "10",
    "nombre": "Jorge Díaz",
    "correo_electronico": "jorge.diaz@example.com",
    "recibir_notificaciones": true,
    "tiempo_maximo_uso_diario": 112.3,
    "direccion": {
      "calle": "Calle 162",
      "ciudad": "Málaga",
      "codigo_postal": "17439",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Ligue 1", "equipo_favorito": "Monaco"},
      {"liga": "Premier League", "equipo_favorito": "Manchester City"},
      {"liga": "Serie A", "equipo_favorito": "Napoli"},
      {"liga": "Bundesliga", "equipo_favorito": "Leverkusen"}
    ]
  },
  {
    "id": "11",
    "nombre": "Sofía Romero",
    "correo_electronico": "sofia.romero@example.com",
    "recibir_notificaciones": true,
    "tiempo_maximo_uso_diario": 108.5,
    "direccion": {
      "calle": "Calle 165",
      "ciudad": "Málaga",
      "codigo_postal": "41571",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Serie A", "equipo_favorito": "Napoli"},
      {"liga": "Bundesliga", "equipo_favorito": "Eintracht Frankfurt"},
      {"liga": "LaLiga", "equipo_favorito": "FC Barcelona"}
    ]
  },
  {
    "id": "12",
    "nombre": "Pedro Navarro",
    "correo_electronico": "pedro.navarro@example.com",
    "recibir_notificaciones": false,
    "tiempo_maximo_uso_diario": 92.4,
    "direccion": {
      "calle": "Calle 165",
      "ciudad": "Zaragoza",
      "codigo_postal": "29925",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Bundesliga", "equipo_favorito": "Leverkusen"},
      {"liga": "Ligue 1", "equipo_favorito": "PSG"}
    ]
  },
  {
    "id": "13",
    "nombre": "Isabel Ortega",
    "correo_electronico": "isabel.ortega@example.com",
    "recibir_notificaciones": true,
    "tiempo_maximo_uso_diario": 121.0,
    "direccion": {
      "calle": "Calle 146",
      "ciudad": "Murcia",
      "codigo_postal": "62154",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "LaLiga", "equipo_favorito": "Atlético de Madrid"},
      {"liga": "Ligue 1", "equipo_favorito": "Lille"},
      {"liga": "Serie A", "equipo_favorito": "Roma"}
    ]
  },
  {
    "id": "14",
    "nombre": "Hugo Castro",
    "correo_electronico": "hugo.castro@example.com",
    "recibir_notificaciones": false,
    "tiempo_maximo_uso_diario": 87.6,
    "direccion": {
      "calle": "Calle 46",
      "ciudad": "Zaragoza",
      "codigo_postal": "32711",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Bundesliga", "equipo_favorito": "Borussia Dortmund"},
      {"liga": "Ligue 1", "equipo_favorito": "Lyon"},
      {"liga": "Serie A", "equipo_favorito": "Roma"}
    ]
  },
  {
    "id": "15",
    "nombre": "Carmen Vidal",
    "correo_electronico": "carmen.vidal@example.com",
    "recibir_notificaciones": false,
    "tiempo_maximo_uso_diario": 99.2,
    "direccion": {
      "calle": "Calle 65",
      "ciudad": "Murcia",
      "codigo_postal": "25467",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Ligue 1", "equipo_favorito": "PSG"},
      {"liga": "Premier League", "equipo_favorito": "Manchester United"},
      {"liga": "Serie A", "equipo_favorito": "Inter de Milan"}
    ]
  },
  {
    "id": "16",
    "nombre": "Álvaro Reyes",
    "correo_electronico": "alvaro.reyes@example.com",
    "recibir_notificaciones": false,
    "tiempo_maximo_uso_diario": 105.7,
    "direccion": {
      "calle": "Calle 198",
      "ciudad": "Bilbao",
      "codigo_postal": "50895",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "LaLiga", "equipo_favorito": "Atlético de Madrid"},
      {"liga": "Bundesliga", "equipo_favorito": "Eintracht Frankfurt"},
      {"liga": "Premier League", "equipo_favorito": "Liverpool"}
    ]
  },
  {
    "id": "17",
    "nombre": "Lucía Herrera",
    "correo_electronico": "lucia.herrera@example.com",
    "recibir_notificaciones": true,
    "tiempo_maximo_uso_diario": 111.4,
    "direccion": {
      "calle": "Calle 167",
      "ciudad": "Zaragoza",
      "codigo_postal": "44017",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "LaLiga", "equipo_favorito": "FC Barcelona"},
      {"liga": "Bundesliga", "equipo_favorito": "Bayern Munich"},
      {"liga": "Premier League", "equipo_favorito": "Liverpool"}
    ]
  },
  {
    "id": "18",
    "nombre": "Mario Ramos",
    "correo_electronico": "mario.ramos@example.com",
    "recibir_notificaciones": false,
    "tiempo_maximo_uso_diario": 96.0,
    "direccion": {
      "calle": "Calle 194",
      "ciudad": "Murcia",
      "codigo_postal": "83603",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Premier League", "equipo_favorito": "Manchester City"},
      {"liga": "Bundesliga", "equipo_favorito": "Leverkusen"}
    ]
  },
  {
    "id": "19",
    "nombre": "Raquel Silva",
    "correo_electronico": "raquel.silva@example.com",
    "recibir_notificaciones": false,
    "tiempo_maximo_uso_diario": 102.8,
    "direccion": {
      "calle": "Calle 147",
      "ciudad": "Madrid",
      "codigo_postal": "84432",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Bundesliga", "equipo_favorito": "Bayern Munich"},
      {"liga": "LaLiga", "equipo_favorito": "Real Madrid"},
      {"liga": "Serie A", "equipo_favorito": "Inter de Milan"}
    ]
  },
  {
    "id": "20",
    "nombre": "Gabriel Cruz",
    "correo_electronico": "gabriel.cruz@example.com",
    "recibir_notificaciones": false,
    "tiempo_maximo_uso_diario": 89.9,
    "direccion": {
      "calle": "Calle 177",
      "ciudad": "Bilbao",
      "codigo_postal": "12228",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Premier League", "equipo_favorito": "Chelsea"},
      {"liga": "Bundesliga", "equipo_favorito": "Leipzig"}
    ]
  },
  {
    "id": "21",
    "nombre": "Marta Blanco",
    "correo_electronico": "marta.blanco@example.com",
    "recibir_notificaciones": false,
    "tiempo_maximo_uso_diario": 100.2,
    "direccion": {
      "calle": "Calle 139",
      "ciudad": "Barcelona",
      "codigo_postal": "57887",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Bundesliga", "equipo_favorito": "Leipzig"},
      {"liga": "Premier League", "equipo_favorito": "Chelsea"},
      {"liga": "Ligue 1", "equipo_favorito": "Lyon"}
    ]
  },
  {
    "id": "22",
    "nombre": "Pablo Vega",
    "correo_electronico": "pablo.vega@example.com",
    "recibir_notificaciones": false,
    "tiempo_maximo_uso_diario": 95.5,
    "direccion": {
      "calle": "Calle 3",
      "ciudad": "Bilbao",
      "codigo_postal": "54420",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Serie A", "equipo_favorito": "Roma"},
      {"liga": "Bundesliga", "equipo_favorito": "Bayern Munich"}
    ]
  },
  {
    "id": "23",
    "nombre": "Paula León",
    "correo_electronico": "paula.leon@example.com",
    "recibir_notificaciones": true,
    "tiempo_maximo_uso_diario": 113.7,
    "direccion": {
      "calle": "Calle 163",
      "ciudad": "Barcelona",
      "codigo_postal": "59932",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Premier League", "equipo_favorito": "Manchester City"},
      {"liga": "Serie A", "equipo_favorito": "Inter de Milan"}
    ]
  },
  {
    "id": "24",
    "nombre": "Sergio Medina",
    "correo_electronico": "sergio.medina@example.com",
    "recibir_notificaciones": false,
    "tiempo_maximo_uso_diario": 90.3,
    "direccion": {
      "calle": "Calle 157",
      "ciudad": "Málaga",
      "codigo_postal": "12235",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Bundesliga", "equipo_favorito": "Eintracht Frankfurt"},
      {"liga": "Premier League", "equipo_favorito": "Arsenal"}
    ]
  },
  {
    "id": "25",
    "nombre": "Clara Domínguez",
    "correo_electronico": "clara.dominguez@example.com",
    "recibir_notificaciones": false,
    "tiempo_maximo_uso_diario": 104.6,
    "direccion": {
      "calle": "Calle 180",
      "ciudad": "Bilbao",
      "codigo_postal": "81290",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Ligue 1", "equipo_favorito": "Lyon"},
      {"liga": "LaLiga", "equipo_favorito": "Atlético de Madrid"}
    ]
  },
  {
    "id": "26",
    "nombre": "Adrián Rubio",
    "correo_electronico": "adrian.rubio@example.com",
    "recibir_notificaciones": false,
    "tiempo_maximo_uso_diario": 115.1,
    "direccion": {
      "calle": "Calle 128",
      "ciudad": "Zaragoza",
      "codigo_postal": "22485",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Ligue 1", "equipo_favorito": "PSG"},
      {"liga": "Serie A", "equipo_favorito": "Inter de Milan"},
      {"liga": "LaLiga", "equipo_favorito": "Real Madrid"},
      {"liga": "Bundesliga", "equipo_favorito": "Borussia Dortmund"}
    ]
  },
  {
    "id": "27",
    "nombre": "Teresa Molina",
    "correo_electronico": "teresa.molina@example.com",
    "recibir_notificaciones": true,
    "tiempo_maximo_uso_diario": 118.2,
    "direccion": {
      "calle": "Calle 57",
      "ciudad": "Sevilla",
      "codigo_postal": "65283",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Premier League", "equipo_favorito": "Manchester City"},
      {"liga": "Bundesliga", "equipo_favorito": "Leipzig"},
      {"liga": "Serie A", "equipo_favorito": "Inter de Milan"},
      {"liga": "LaLiga", "equipo_favorito": "Atlético de Madrid"}
    ]
  },
  {
    "id": "28",
    "nombre": "Iván Campos",
    "correo_electronico": "ivan.campos@example.com",
    "recibir_notificaciones": false,
    "tiempo_maximo_uso_diario": 101.9,
    "direccion": {
      "calle": "Calle 110",
      "ciudad": "Valencia",
      "codigo_postal": "12913",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Premier League", "equipo_favorito": "Manchester City"},
      {"liga": "Bundesliga", "equipo_favorito": "Bayern Munich"},
      {"liga": "LaLiga", "equipo_favorito": "Sevilla FC"}
    ]
  },
  {
    "id": "29",
    "nombre": "Nuria Vidal",
    "correo_electronico": "nuria.vidal@example.com",
    "recibir_notificaciones": false,
    "tiempo_maximo_uso_diario": 97.3,
    "direccion": {
      "calle": "Calle 175",
      "ciudad": "Málaga",
      "codigo_postal": "73102",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "LaLiga", "equipo_favorito": "Atlético de Madrid"},
      {"liga": "Premier League", "equipo_favorito": "Manchester City"},
      {"liga": "Serie A", "equipo_favorito": "Inter de Milan"}
    ]
  },
  {
    "id": "30",
    "nombre": "Diego Pastor",
    "correo_electronico": "diego.pastor@example.com",
    "recibir_notificaciones": true,
    "tiempo_maximo_uso_diario": 121.7,
    "direccion": {
      "calle": "Calle 10",
      "ciudad": "Málaga",
      "codigo_postal": "97186",
      "pais": "España"
    },
    "ligas_favoritas": [
      {"liga": "Premier League", "equipo_favorito": "Chelsea"},
      {"liga": "Bundesliga", "equipo_favorito": "Leverkusen"}
    ]
  }
]

)