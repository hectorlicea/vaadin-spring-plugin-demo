<?xml version="1.0" encoding="utf-8"?>
 <xsl:stylesheet xmlns:xs="http://www.w3.org/2001/XMLSchema"  
 xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns="http://www.tei-c.org/ns/1.0"    
 xmlns:tei="http://www.tei-c.org/ns/1.0" xmlns:m="http://www.w3.org/1998/Math/MathML"    
 exclude-result-prefixes="tei xs m" version="2.0"    xmlns:html="http://www.w3.org/1999/xhtml" 
 xpath-default-namespace="http://www.w3.org/1999/xhtml">

	<xsl:template match="@*|node()">
	  <xsl:copy>
	    <xsl:apply-templates select="@*|node()"/>
	  </xsl:copy>
	</xsl:template>
	<xsl:template match="tei:w">
	<xsl:copy>
	  <xsl:attribute name="pos">
	    <xsl:value-of select="substring(@ana,1,1)"/>	    
	  </xsl:attribute>
	  <xsl:apply-templates select="@*|node()" />
	  </xsl:copy>
	</xsl:template>
</xsl:stylesheet>
