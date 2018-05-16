
function faktoriser(tall) {
    primtall = hentPrimtall(tall + 1); //Henter alle primtall til og med tall mottat (kan gjøres mer effektivt)
    faktorer = [];
    ikkeEn = tall != 1;
    if (primtall.length > 0) {
        while (ikkeEn) {
            for (var i = 0; i < primtall.length; i++) {
                if (tall % primtall[i] == 0) {
                    faktorer.push(primtall[i]);
                    tall /= primtall[i];
                    ikkeEn = tall != 1;
                    break;
                }
            }
        }
    }

    return factors
}

function hentPrimtall(tall) {
    liste = [2];
    if (tall > 2) {
        for (var i = 2; i < tall; i++) {
            erPrimtall = true;
            for (var j = 0; j < liste.length; j++) {
                if (i % liste[j] == 0) {
                    erPrimtall = false;
                    break;
                }
            }
            if (erPrimtall) {
                liste.push(i);
            }
        }
    }
    return liste;
}
