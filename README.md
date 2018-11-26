# tp5_POO
1. Avec quelle partie du code avons-nous parametre l’url d’appel /greeting ?
	@GetMapping("/greeting")
2. Avec quelle partie du code avons-nous choisi le fichier HTML a afficher ?
	return "greeting";
3. Comment envoyons-nous le nom a qui nous disons bonjour avec le second lien ?
	 model.addAttribute("nomTemplate", nameGET);
4. Etape 17
	La table article contenant les différents attibuts à été créée.
5. Etape 18
	Le @Entity permet de dire que la classe Article est une entité.
	@Id permet de spécifier que l'attribut qui suit est la clée primaire.
	@GeneratedValue  
