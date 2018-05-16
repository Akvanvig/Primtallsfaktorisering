#Factorizes a number
def faktoriser(tall):
    primtall = hentPrimtall(tall + 1)  #+1 to avoid constant loop if given number itself is prime
    faktorer = []
    ikkeEn = tall != 1

    if primtall.length > 0:
        while ikkeEn:   #While number hasn't reached 1
            for verdi in primtall:
                if tall % verdi == 0:
                    faktorer.append(verdi)
                    tall /= verdi
                    ikkeEn = number != 1
                    break

    return factors


def hentPrimtall(tall):
    liste = [2]
    if tall > 2:
        for i in range(2,tall):
            erPrimtall = True
            for primtall in liste:
                if i % primtall == 0:
                    erPrimtall = False
                    break
            if erPrimtall:
                liste.append(i)

    return liste
