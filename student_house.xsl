<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">
        <html>
            <head>
                <title>StudentHouse – Gestion des logements étudiants</title>
            </head>

            <body style="font-family:Verdana; background-color:#f0f0f0; color:#333;">

                <h1 style="color:#2b3a67;">Residences universitaires</h1>

                <xsl:for-each select="residences_etudiantes/residence">
                    <div style="border:1px solid #ccc; border-radius:10px; padding:15px; margin:15px; background-color:#fff;">
                        <h2><xsl:value-of select="@nom"/> (<xsl:value-of select="@localisation"/>)</h2>

                        <h3>Chambres disponibles :</h3>
                        <table border="1" cellpadding="5" style="border-collapse:collapse; width:80%;">
                            <tr bgcolor="#ddd"><th>Numéro</th><th>Type</th><th>Prix (DT)</th><th>Disponible</th></tr>
                            <xsl:for-each select="chambres/chambre">
                                <tr>
                                    <td><xsl:value-of select="@numero"/></td>
                                    <td><xsl:value-of select="@type"/></td>
                                    <td><xsl:value-of select="@prix"/></td>
                                    <td><xsl:value-of select="@disponible"/></td>
                                </tr>
                            </xsl:for-each>
                        </table>

                        <xsl:if test="etudiants/etudiant">
                            <h3>Étudiants hébergés :</h3>
                            <ul>
                                <xsl:for-each select="etudiants/etudiant">
                                    <li>
                                        👤 <b><xsl:value-of select="@nom"/></b> (Âge : <xsl:value-of select="@age"/> ans)
                                        – Chambre : <xsl:value-of select="@chambre_ref"/>
                                        – Paiement : <xsl:value-of select="paiement/@statut"/> (<xsl:value-of select="paiement/@montant"/> DT – <xsl:value-of select="paiement/@mois"/>)
                                    </li>
                                </xsl:for-each>
                            </ul>
                        </xsl:if>
                    </div>
                </xsl:for-each>

            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
