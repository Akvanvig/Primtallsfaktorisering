Public Class Primtall
    Public Function faktoriser(tall As Integer) As List(Of Integer)
        Dim primtall As List(Of Integer) = hentPrimtall(Math.Ceiling(tall / 2))
        Dim faktorer As List(Of Integer)
        Dim ikkeEn = tall <> 1
        If primtall.Count > 0 Then
            While ikkeEn
                Dim ikkeEndret = True
                For Each verdi In primtall
                    If tall Mod verdi = 0 Then
                        faktorer.Add(verdi)
                        tall /= verdi
                        ikkeEn = tall <> 1
                        ikkeEndret = False
                        Exit For
                    End If
                Next
                If ikkeEndret Then
                    faktorer.Add(tall)
                    ikkeEn = False
                End If
            End While
        End If
        Return faktorer
    End Function

    Public Function hentPrimtall(tall As Integer) As List(Of Integer)
        Dim liste = New List(Of Integer) From {2}
        If tall > 2 Then
            For i = 2 To tall
                Dim erPrimtall = True
                For Each primtall In liste
                    If i Mod primtall = 0 Then
                        erPrimtall = False
                        Exit For
                    End If
                Next
                If erPrimtall Then
                    liste.Add(i)
                End If
            Next
        End If
        Return liste
    End Function
End Class
