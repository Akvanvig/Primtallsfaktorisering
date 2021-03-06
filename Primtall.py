import math

num = input("Hvilket tall skal sjekkes? \n")

#Factorizes a number
def faktoriser(tall):
    primtall = hentPrimtall(math.ceil(tall / 2))
    faktorer = []
    ikkeEn = tall != 1
    if len(primtall) > 0:
        while ikkeEn:   #While number hasn't reached 1
            ikkeEndret = True
            for verdi in primtall:
                if tall % verdi == 0:
                    faktorer.append(verdi)
                    tall /= verdi
                    ikkeEn = tall != 1
                    ikkeEndret = False
                    break
            if ikkeEndret:
                faktorer.append(int(tall))
                ikkeEn = False
    return faktorer


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


def main(tall):
    try:
        print(faktoriser(int(tall)))
    except Exception as e:
        print(e)


main(num)
