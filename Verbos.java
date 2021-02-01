package algoritmoconjugacionfrances;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author vmpor
 */
public class Verbos {

    //Arreglo con verbos conjugados en 6 sujetos
    class VerbosIrregulares {

        private String verb;
        private String pripersonasin;
        private String segpersonasin;
        private String terpersonasin;
        private String pripersonaplu;
        private String segpersonaplu;
        private String terpersonaplu;

        VerbosIrregulares(String verbo, String pripersonasin, String segpersonasin, String terpersonasin, String pripersonaplu, String segpersonaplu, String terpersonaplu) {
            verb = verbo;
            this.pripersonasin = pripersonasin;
            this.pripersonaplu = pripersonaplu;
            this.segpersonasin = segpersonasin;
            this.terpersonasin = terpersonasin;
            this.pripersonaplu = pripersonaplu;
            this.segpersonaplu = segpersonaplu;
            this.terpersonaplu = terpersonaplu;
        }

        public String getConjugacion(int i) {
            if (i == 0) {
                return pripersonasin;
            }
            if (i == 1) {
                return segpersonasin;
            }
            if (i == 2) {
                return terpersonasin;
            }
            if (i == 3) {
                return terpersonasin;
            }
            if (i == 4) {
                return terpersonasin;
            }
            if (i == 5) {
                return pripersonaplu;
            }
            if (i == 6) {
                return segpersonaplu;
            }
            if (i == 7) {
                return terpersonaplu;
            }
            if (i == 8) {
                return terpersonaplu;
            }
            return null;
        }
    }
    private String[] verbosMovimiento = {"Naître", "Rester", "Tomber", "Monter", "Passer", "Rester", "Entrer", "Arriver", "Retourner", "Tourner", "Aller",
        "Mourir", "Venir", "Devenir", "Sortir", "Partir"};
    ;
    private ArrayList<VerbosIrregulares> irregulares = new ArrayList<VerbosIrregulares>();
    //131 verbos
    private String regulares[] = {"Aider", "Acheter", "Aimer", "Fournir", "Trouver", "Commencer", "Manger", "Penser", "Pardonner",
        "Jeter", "Appeler", "Nettoyer", "Ennuyer", "Payer", "Finir", "Rougir", "Choisir", "Parler", "Regardmettreer", "Penser", "Jouer", "Vendre",
        "Travailler", "Donner", "Oublier", "Souhaiter", "Fermer", "Mettre", "Battre", "Promettre", "Combattre", "Soumettre", "Connaître", "Naître",
        "Apparaître", "Reconnaître", "Employer", "Envoyer", "Lancer", "Modeler", "Placer", "Créer", "Entendre", "Adorer", "Amener",
        "Annoncer", "Assister", "Descendre", "Inventer", "Gagner", "Interroger", "Inviter", "Laver", "Marcher", "Nager", "Pleurer", "Refuser", "Réparer",
        "Rester", "Téléphoner", "Tomber", "Trouver", "Vendre", "Voyager", "Voler", "User", "Utiliser", "Rêver", "Changer", "Bavarder", "Partager", "Recommander",
        "Comprendre", "Protéger", "Habiter", "Détester", "Réfléchir", "Penser", "Accepter", "Amener", "Conduire", "Interdire", "Lire", "Prédire", "Traduire",
        "Monter", "Passer", "Rentrer", "Entrer", "Arriver", "Retourner", "Accompagner", "Approuver", "Arrêter", "Attendre", "Brûler", "Cacher", "Céder",
        "Chanter", "Chercher", "Danser", "Décider", "Gêner", "Habiller", "Laisser", "Manquer", "Montrer", "Obéir", "Obliger", "Peigner", "Porter",
        "Quitter", "Raconter", "Rendre", "Répéter", "Taire", "Perdre", "Effacer", "Préparer", "Réparer", "Cuisiner", "Tourner",
        "Construire", "Lutter", "Draguer", "Baigner", "Baiser", "Embrasser", "Agir", "Échanger", "Élever", "Sembler", "Importer", "Emporter",
        "Prêter", "Peser"};

    //Verbos irregulares passé compose
    class VerbosIrregularesPasseCompose {

        private String verb;
        private String participePasse;

        VerbosIrregularesPasseCompose(String verbo, String participePasse) {
            verb = verbo;
            this.participePasse = participePasse;
        }

        public String getVerb() {
            return verb;
        }

        public String getParticipePasse() {
            return participePasse;
        }
    }//Verbos irregulares futur

    ArrayList<VerbosIrregularesPasseCompose> irregularesPasseCompose = new ArrayList<>();

    ArrayList<VerbosIrregulares> irregularesFutur = new ArrayList<VerbosIrregulares>();

    //37 verbos
    Verbos() {
        irregulares.add(new VerbosIrregulares("Devoir", "Dois", "Dois", "Doit", "Devons", "Devez", "Doivent"));
        irregulares.add(new VerbosIrregulares("Être", "Suis", "Es", "Est", "Sommes", "Êtes", "Sont"));
        irregulares.add(new VerbosIrregulares("Avoir", "Ai", "As", "A", "Avons", "Avez", "Ont"));
        irregulares.add(new VerbosIrregulares("Aller", "Vais", "Vas", "Va", "Allons", "Allez", "Vont"));
        irregulares.add(new VerbosIrregulares("Faire", "Fais", "Fais", "Fait", "Faisons", "Faites", "Font"));
        irregulares.add(new VerbosIrregulares("Prendre", "Prends", "Prends", "Prend", "Prenons", "Prenez", "Prennent"));
        irregulares.add(new VerbosIrregulares("Appeler", "Appelle", "Appelles", "Appelle", "Appelons", "Appelez", "Appellent"));
        irregulares.add(new VerbosIrregulares("Atteindre", "Atteins", "Atteins", "Atteint", "Atteignons", "Atteignez", "Atteignent"));
        irregulares.add(new VerbosIrregulares("Dormir", "Dors", "Dors", "Dort", "Dormons", "Dormez", "Dorment"));
        irregulares.add(new VerbosIrregulares("Offrir", "Offre", "Offres", "Offre", "Offrons", "Offrez", "Offrent"));
        irregulares.add(new VerbosIrregulares("Fuir", "Fuis", "Fuis", "Fuit", "Fuyons", "Fuyez", "Fuient"));
        irregulares.add(new VerbosIrregulares("Boire", "bois", "Bois", "Boit", "Buvons", "Buvez", "Boivent"));
        irregulares.add(new VerbosIrregulares("Vouloir", "Veux", "Veux", "Veut", "Voulons", "Voulez", "Veulent"));
        irregulares.add(new VerbosIrregulares("Pouvoir", "Peux", "Peux", "Peut", "Pouvons", "Pouvez", "Peuvent"));
        irregulares.add(new VerbosIrregulares("Valoir", "Vaux", "Vaux", "Vaut", "Valons", "Valez", "Valent"));
        irregulares.add(new VerbosIrregulares("Recevoir", "Reçois", "Reçois", "Reçoit", "Recevons", "Recevez", "Reçoivent"));
        irregulares.add(new VerbosIrregulares("Céder", "Cède", "Cèdes", "Cède", "Cédons", "Cédez", "Cèdent"));
        irregulares.add(new VerbosIrregulares("Clore", "Clos", "Clos", "Clôt", "Clos", "Clôt", "Closent"));
        irregulares.add(new VerbosIrregulares("Courir", "Cours", "Cours", "Court", "Courons", "Courez", "Courent"));
        irregulares.add(new VerbosIrregulares("Croire", "Crois", "Crois", "Croit", "Croyons", "Croyez", "Croient"));
        irregulares.add(new VerbosIrregulares("Dire", "Dis", "Dis", "Dit", "Disons", "Dites", "Disent"));
        irregulares.add(new VerbosIrregulares("Écrire", "Écris", "Écris", "Écrit", "Écrivons", "Écrivez", "Écrivent"));
        irregulares.add(new VerbosIrregulares("Mourir", "Meurs", "Meurs", "Meurt", "Mourons", "Mourez", "Meurent"));
        irregulares.add(new VerbosIrregulares("Mouvoir", "Meus", "Meus", "Meut", "Mouvons", "Mouvez", "Meuvent"));
        irregulares.add(new VerbosIrregulares("Savoir", "Sais", "Sais", "Sait", "Savons", "Savez", "Savent"));
        irregulares.add(new VerbosIrregulares("Servir", "Sers", "Sers", "Sert", "Servons", "Servez", "Servent"));
        irregulares.add(new VerbosIrregulares("Venir", "Viens", "Viens", "Vient", "Venons", "Venez", "Viennent"));
        irregulares.add(new VerbosIrregulares("Vêtir", "Vêts", "Vêts", "Vêt", "Vêtons", "Vêtez", "Vêtent"));
        irregulares.add(new VerbosIrregulares("Vivre", "Vis", "Vis", "Vit", "Vivons", "Vivez", "Vivent"));
        irregulares.add(new VerbosIrregulares("Voir", "Vois", "Vois", "Voit", "Voyons", "Voyez", "Voient"));
        irregulares.add(new VerbosIrregulares("Devenir", "Deviens", "Deviens", "Devient", "Devenons", "Devenez", "Deviennent"));
        irregulares.add(new VerbosIrregulares("Apprendre", "Apprends", "Apprends", "Apprend", "Apprenons", "Apprenez", "Apprennent"));
        irregulares.add(new VerbosIrregulares("Obtenir", "Obtiens", "Obtiens", "Obtient", "Obtenons", "Obtenez", "Obtiennent"));
        irregulares.add(new VerbosIrregulares("Rire", "Ris", "Ris", "Rit", "Rions", "Riez", "Rient"));
        irregulares.add(new VerbosIrregulares("Sortir", "Sors", "Sors", "Sort", "Sortons", "Sortez", "Sortent"));
        irregulares.add(new VerbosIrregulares("Ouvrir", "Ouvre", "Ouvres", "Ouvre", "Ouvrons", "Ouvrez", "Ouvrent"));
        irregulares.add(new VerbosIrregulares("Souffrir", "Souffre", "Souffres", "Souffre", "Souffrons", "Souffrez", "Souffrent"));
        irregulares.add(new VerbosIrregulares("Ressentir", "Ressens", "Ressens", "Ressent", "Ressentons", "Ressentez", "Ressentent"));
        irregulares.add(new VerbosIrregulares("Partir", "Pars", "Pars", "Part", "Partons", "Partez", "Partent"));
        irregulares.add(new VerbosIrregulares("Acquérir", "Acquiers", "Acquiers", "Acquiert", "Acquérons", "Acquérez", "Acquièrent"));
        irregulares.add(new VerbosIrregulares("Convaincre", "Convaincs", "Convaincs", "Convainc", "Convainquons", "Convainquez", "Convainquent"));
        irregulares.add(new VerbosIrregulares("Craindre", "Crains", "Crains", "Craint", "Craignons", "Craignez", "Craignent"));
        irregulares.add(new VerbosIrregulares("Éteindre", "Éteins", "Éteins", "Éteint", "Éteignons", "Éteignez", "Éteignent"));
        irregulares.add(new VerbosIrregulares("Haïr", "Hais", "Hais", "Hait", "Haïssons", "Haïssez", "Haïssent"));
        irregulares.add(new VerbosIrregulares("Joindre", "Joins", "Joins", "Joint", "Joignons", "Joignez", "Joignent"));
        irregulares.add(new VerbosIrregulares("Plaire", "Plais", "Plais", "Plaît", "Plaisons", "Plaisez", "Plaisent"));
        irregulares.add(new VerbosIrregulares("Tenir", "Tiens", "Tiens", "Tient", "Tenons", "Tenez", "Tiennent"));
        irregulares.add(new VerbosIrregulares("Vaincre", "Vaincs", "Vaincs", "Vainc", "Vainquons", "Vainquez", "Vainquent"));
        irregulares.add(new VerbosIrregulares("Asseoir", "Assois", "Assois", "Assoit", "Assoyons", "Assoyez", "Assoient"));
        irregulares.add(new VerbosIrregulares("Sourire", "Souris", "Souris", "Sourit", "Sourions", "Souriez", "Sourient"));

        //Verbos passe compose irregulares
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Sourire", "Souri"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Naître", "Né"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Prendre", "Pris"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Comprendre", "Compris"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Lire", "Lu"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Asseoir", "Assis"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Tenir", "Tenu"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Plaire", "Plu"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Taire", "Tu"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Devoir", "Dû"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Avoir", "Eu"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Atteindre", "Atteint"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Offrir", "Offert"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Boire", "Bu"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Vouloir", "Voulu"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Pouvoir", "Pu"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Valoir", "Valu"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Recevoir", "Reçu"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Joindre", "Joint"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Haïr", "Haï"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Clore", "Clos"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Courir", "Couru"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Croire", "Cru"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Mourir", "Mort"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Mouvoir", "Mû"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Savoir", "Su"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Savoir", "Su"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Vêtir", "Vêtu"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Vivre", "Vécu"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Voir", "Vu"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Venir", "Venu"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Devenir", "Devenu"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Apprendre", "Apris"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Obtenir", "Obtenu"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Rire", "Ri"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Souffrir", "Souffert"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Acquérir", "Acquis"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Craindre", "Craint"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Éteindre", "Éteint"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Être", "Été"));
        irregularesPasseCompose.add(new VerbosIrregularesPasseCompose("Ouvrir", "Ouvert"));

        //Irregulares futur 
        irregularesFutur.add(new VerbosIrregulares("Aller", "Irai", "iras", "Ira", "Irons", "Irez", "Iront"));
        irregularesFutur.add(new VerbosIrregulares("Envoyer", "Enverrai", "Enverras", "Enverra", "Enverrons", "Enverrez", "Enverront"));
        irregularesFutur.add(new VerbosIrregulares("Savoir", "Saurai", "Sauras", "Saura", "Saurons", "Saurez", "Sauront"));
        irregularesFutur.add(new VerbosIrregulares("Pouvoir", "Pourrai", "Pourras", "Pourra", "Pourrons", "Pourrez", "Pourront"));
        irregularesFutur.add(new VerbosIrregulares("Vouloir", "Voudrai", "Voudras", "Voudra", "Voudrons", "Voudrez", "Voudront"));
        irregularesFutur.add(new VerbosIrregulares("Faire", "Ferai", "Feras", "Fera", "Ferons", "Ferez", "Feront"));
        irregularesFutur.add(new VerbosIrregulares("Devoir", "Devrai", "Devras", "Devra", "Devrons", "Devrez", "Devront"));
        irregularesFutur.add(new VerbosIrregulares("Devoir", "Devrai", "Devras", "Devra", "Devrons", "Devrez", "Devront"));
        irregularesFutur.add(new VerbosIrregulares("Valoir", "Vaudrai", "Vaudras", "Vaudra", "Vaudrons", "Vaudrez", "Vaudront"));
        irregularesFutur.add(new VerbosIrregulares("Recevoir", "Recevrai", "Recevras", "Recevra", "Recevrons", "Recevrez", "Recevront"));
        irregularesFutur.add(new VerbosIrregulares("Mouvoir", "Mouvrai", "Mouvras", "Mouvra", "Mouvrons", "Mouvrez", "Mouvront"));
        irregularesFutur.add(new VerbosIrregulares("Venir", "Viendrai", "Viendras", "Viendra", "Viendrons", "Viendrez", "Viendront"));
        irregularesFutur.add(new VerbosIrregulares("Voir", "Verrai", "Verras", "Verra", "Verrons", "Verrez", "Verront"));
        irregularesFutur.add(new VerbosIrregulares("Devenir", "Deviendrai", "Deviendras", "Deviendra", "Deviendrons", "Deviendrez", "Deviendront"));
        irregularesFutur.add(new VerbosIrregulares("Obtenir", "Obtiendrai", "Obtiendras", "Obtiendra", "Obtiendrons", "Obtiendrez", "Obtiendront"));
        irregularesFutur.add(new VerbosIrregulares("Tenir", "Tiendrai", "Tiendras", "Tiendra", "Tiendrons", "Tiendrez", "Tiendront"));
        irregularesFutur.add(new VerbosIrregulares("Asseoir", "Assiérai", "Assiéras", "Assiéra", "Assiérons", "Assiérez", "Assiéront"));

    }

    public String devuelveParticipePasse(String verbo) {
        for (int i = 0; i < irregularesPasseCompose.size(); i++) {
            if (verbo.equalsIgnoreCase(irregularesPasseCompose.get(i).verb)) {
                return irregularesPasseCompose.get(i).participePasse;
            }
        }
        return null;
    }

    public String devuelveConjugacionIrregular(String verbo, int sujeto) {
        for (int i = 0; i < irregulares.size(); i++) {
            if (verbo.equalsIgnoreCase(irregulares.get(i).verb)) {
                if (sujeto == 0) {
                    return irregulares.get(i).pripersonasin;
                }
                if (sujeto == 1) {
                    return irregulares.get(i).segpersonasin;
                }
                if (sujeto == 2 || sujeto == 3 || sujeto == 4) {
                    return irregulares.get(i).terpersonasin;
                }
                if (sujeto == 5) {
                    return irregulares.get(i).pripersonaplu;
                }
                if (sujeto == 6) {
                    return irregulares.get(i).segpersonaplu;
                }
                if (sujeto == 7 || sujeto == 8) {
                    return irregulares.get(i).terpersonaplu;
                } else {
                    return "Error";
                }
            }
        }
        return "Error";
    }

    public String devuelveParticipePasseIrregular(String verbo) {
        for (int i = 0; i < irregularesPasseCompose.size(); i++) {
            if (verbo.equalsIgnoreCase(irregularesPasseCompose.get(i).verb)) {
                return irregularesPasseCompose.get(i).participePasse;
            }
        }
        return "Error";
    }

    public String devuelveFuturIrregular(String verbo, int sujeto) {
        for (int i = 0; i < irregularesFutur.size(); i++) {
            if (verbo.equalsIgnoreCase(irregularesFutur.get(i).verb)) {
                //Je
                if (sujeto == 0) {
                    return irregularesFutur.get(i).pripersonasin;
                } //Tu
                else if (sujeto == 1) {
                    return irregularesFutur.get(i).segpersonasin;
                } //Il/Elle/On
                else if (sujeto == 2 || sujeto == 3 || sujeto == 4) {
                    return irregularesFutur.get(i).terpersonasin;
                } //Nous
                else if (sujeto == 5) {
                    return irregularesFutur.get(i).pripersonaplu;
                } //Vous
                else if (sujeto == 6) {
                    return irregularesFutur.get(i).segpersonaplu;
                } //Ils/Elles
                else if (sujeto == 7 || sujeto == 8) {
                    return irregularesFutur.get(i).terpersonaplu;
                }
            }
        }
        return "Error";
    }
    
    
    public String devuelvePresentIrregular(String verbo, int sujeto) {
        for (int i = 0; i < irregulares.size(); i++) {
            if (verbo.equalsIgnoreCase(irregulares.get(i).verb)) {
                //Je
                if (sujeto == 0) {
                    return irregulares.get(i).pripersonasin;
                } //Tu
                else if (sujeto == 1) {
                    return irregulares.get(i).segpersonasin;
                } //Il/Elle/On
                else if (sujeto == 2 || sujeto == 3 || sujeto == 4) {
                    return irregulares.get(i).terpersonasin;
                } //Nous
                else if (sujeto == 5) {
                    return irregulares.get(i).pripersonaplu;
                } //Vous
                else if (sujeto == 6) {
                    return irregulares.get(i).segpersonaplu;
                } //Ils/Elles
                else if (sujeto == 7 || sujeto == 8) {
                    return irregulares.get(i).terpersonaplu;
                }
            }
        }
        return "Error";
    }

    public String[] getVerbosMovimiento() {
        return verbosMovimiento;
    }

    public String getVerboAleatorio() {
        Random alea = new Random(System.currentTimeMillis());
        alea.setSeed(System.currentTimeMillis());
        int aleatorio = alea.nextInt(3);
        alea.setSeed(System.currentTimeMillis());
        if (aleatorio == 0) {
            return getIrregulares().get(alea.nextInt(irregulares.size())).verb;
        } else {
            return regulares[alea.nextInt(regulares.length)];
        }
    }

    public ArrayList<VerbosIrregulares> getIrregulares() {
        return irregulares;
    }

    public String[] getRegulares() {
        return regulares;
    }

    public boolean isIrregular(String verbo) {
        for (int i = 0; i < irregulares.size(); i++) {
            if (verbo.equalsIgnoreCase(irregulares.get(i).verb)) {
                return true;
            }
        }
        return false;
    }

    public boolean isIrregularParticipePasse(String verbo) {
        for (int i = 0; i < irregularesPasseCompose.size(); i++) {
            if (verbo.equalsIgnoreCase(irregularesPasseCompose.get(i).verb)) {
                return true;
            }
        }
        return false;
    }

    public boolean isIrregularFutur(String verbo) {
        for (int i = 0; i < irregularesFutur.size(); i++) {
            if (verbo.equalsIgnoreCase(irregularesFutur.get(i).verb)) {
                return true;
            }
        }
        return false;
    }

    public boolean buscaVerbo(String verbo) {
        for (int i = 0; i < regulares.length; i++) {
            if (verbo.equalsIgnoreCase(regulares[i])) {
                return true;
            }
        }
        for (int i = 0; i < irregulares.size(); i++) {
            if (verbo.equalsIgnoreCase(irregulares.get(i).verb)) {
                return true;
            }
        }
        return false;
    }

    public int contarTodosVerbos() {
        return regulares.length + irregulares.size();
    }

    public int contarVerbosRegulares() {
        return regulares.length;
    }

    public int contarVerbosIrregulares() {
        return irregulares.size();
    }

    public String devuelveParticipePasseIrregularFinal(String verbo, int sujeto) {
        String salida = "";
        //avoir por defecto(false)
        boolean etreAvoir = false;
        Verbos verbos = new Verbos();
        String[] verbosMovimiento = (String[]) verbos.getVerbosMovimiento();
        for (int i = 0; i < verbosMovimiento.length; i++) {
            if (verbo.equalsIgnoreCase(verbosMovimiento[i])) {
                etreAvoir = true;
                break;
            }
        }
        if (etreAvoir) {
            //verbos con être
            if (sujeto == 0) {
                salida = "Suis ";
            } //Tu
            else if (sujeto == 1) {
                salida = "Es ";
            } //Il/Elle/On
            else if (sujeto == 2 || sujeto == 3 || sujeto == 4) {
                salida = "Est ";
            } //Nous
            else if (sujeto == 5) {
                salida = "Sommes ";
            } //Vous
            else if (sujeto == 6) {
                salida = "Êtes ";
            } //Ils/Elles
            else if (sujeto == 7 || sujeto == 8) {
                salida = "Sont ";
            }
        } else {
            //verbos con avoir
            //Je
            if (sujeto == 0) {
                salida = "Ai ";
            } //Tu
            else if (sujeto == 1) {
                salida = "As ";
            } //Il/Elle/On
            else if (sujeto == 2 || sujeto == 3 || sujeto == 4) {
                salida = "A ";
            } //Nous
            else if (sujeto == 5) {
                salida = "Avons ";
            } //Vous
            else if (sujeto == 6) {
                salida = "Avez ";
            } //Ils/Elles
            else if (sujeto == 7 || sujeto == 8) {
                salida = "Ont ";
            }
        }
        for (int i = 0; i < irregularesPasseCompose.size(); i++) {
            if (verbo.equalsIgnoreCase(irregularesPasseCompose.get(i).verb)) {
                return salida += irregularesPasseCompose.get(i).participePasse;
            }
        }
        return "Error";
    }
}
