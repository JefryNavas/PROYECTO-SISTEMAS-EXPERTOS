

;;Definimos el template que recibira la informacion para  identificar un lenguaje de programación para resolver un problema 
(deftemplate lenguaje-programacion 
		(slot tipo)
		(slot licencia)
		(slot so))
	
;;DEfinimos el template que guardara el mensaje de salida
(deftemplate recomendacion
		(slot mensaje))

;;Definimos las reglas para el opcion1
(defrule opcion1-0
	(lenguaje-programacion
		(tipo software_matematico)
		(licencia privativo)
		(so linux))
	=> 	(printout t crlf "Se te recomienda la utilizacion de Matlab." crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de Matlab. ")))	
)

(defrule opcion1-1
	(lenguaje-programacion
		(tipo software_matematico)
		(licencia privativo)
		(so windows))
	=> 	(printout t crlf "Se te recomienda la utilizacion de Matlab" crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de Matlab ")))
)

(defrule opcion1-2
	(lenguaje-programacion
		(tipo software_matematico)
		(licencia GNU)
		(so windows))
	=> 	(printout t crlf "Se te recomienda la utilizacion de Octave" crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de Matlab ")))
)

(defrule opcion1-3
	(lenguaje-programacion
		(tipo software_matematico)
		(licencia GNU)
		(so linux))
	=> 	(printout t crlf "Se te recomienda la utilizacion de Octave" crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de Matlab ")))
)


;;Definimos las reglas para el opcion2
(defrule opcion2-0
	(lenguaje-programacion
		(tipo arquitectura)
		(licencia privativo)
		(so windows))
	=> 	(printout t crlf "Se te recomienda la utilizacion de Autocad " crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de Autocad ")))
)

(defrule opcion2-1
	(lenguaje-programacion
		(tipo arquitectura)
		(licencia privativo)
		(so linux))
	=> 	(printout t crlf "Se te recomienda la utilizacion de DraftSight " crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de DraftSight ")))
)

(defrule opcion2-2
	(lenguaje-programacion
		(tipo arquitectura)
		(licencia GNU)
		(so windows))
	=> 	(printout t crlf "Se te recomienda la utilizacion de Freecad " crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de Freecad ")))
)

(defrule opcion2-3
	(lenguaje-programacion
		(tipo arquitectura)
		(licencia GNU)
		(so linux))
	=> 	(printout t crlf "Se te recomienda la utilizacion de Freecad " crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de Freecad ")))
)


;;Definimos las reglas para el opcion3
(defrule opcion3-0
	(lenguaje-programacion
		(tipo sistema_experto)
		(licencia privativo)
		(so windows))
	=> 	(printout t crlf "Se te recomienda la utilizacion de Prolog " crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de Prolog ")))
)

(defrule opcion3-1
	(lenguaje-programacion
		(tipo sistema_experto)
		(licencia privativo)
		(so linux))
	=> 	(printout t crlf "Se te recomienda la utilizacion de Prolog " crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de Prolog ")))
)

(defrule opcion3-2
	(lenguaje-programacion
		(tipo sistema_experto)
		(licencia GNU)
		(so windows))
	=> 	(printout t crlf "Se te recomienda la utilizacion de Clips " crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de Clips ")))
)

(defrule opcion3-3
	(lenguaje-programacion
		(tipo sistema_experto)
		(licencia GNU)
		(so linux))
	=> 	(printout t crlf "Se te recomienda la utilizacion de Clips " crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de Clips ")))
)

;;Definimos las reglas para el opcion4
(defrule opcion4-0
	(lenguaje-programacion
		(tipo edicion_fotografica)
		(licencia privativo)
		(so windows))
	=> 	(printout t crlf "Se te recomienda la utilizacion de Adobe Photoshop " crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de Adobe Photoshop ")))
)

(defrule opcion4-1
	(lenguaje-programacion
		(tipo edicion_fotografica)
		(licencia privativo)
		(so linux))
	=> 	(printout t crlf "Se te recomienda la utilizacion de Adobe Photoshop " crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de Adobe Photoshop ")))
)

(defrule opcion4-2
	(lenguaje-programacion
		(tipo edicion_fotografica)
		(licencia GNU)
		(so windows))
	=> 	(printout t crlf "Se te recomienda la utilizacion de GIMP " crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de GIMP ")))
)

(defrule opcion4-3
	(lenguaje-programacion
		(tipo edicion_fotografica)
		(licencia GNU)
		(so linux))
	=> 	(printout t crlf "Se te recomienda la utilizacion de GIMP " crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de GIMP ")))
)


;;Definimos las reglas para el opcion5
(defrule opcion5-0
	(lenguaje-programacion
		(tipo edicion_vectorial)
		(licencia privativo)
		(so windows))
	=> 	(printout t crlf "Se te recomienda la utilizacion de Adobe Illustrator " crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de Adobe Illustrator ")))
)

(defrule opcion5-1
	(lenguaje-programacion
		(tipo edicion_vectorial)
		(licencia privativo)
		(so linux))
	=> 	(printout t crlf "Se te recomienda la utilizacion de Adobe Illustrator " crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de Adobe Illustrator ")))
)

(defrule opcion5-2
	(lenguaje-programacion
		(tipo edicion_vectorial)
		(licencia GNU)
		(so windows))
	=> 	(printout t crlf "Se te recomienda la utilizacion de Inkscape " crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de Inkscape ")))
)

(defrule opcion5-3
	(lenguaje-programacion
		(tipo edicion_vectorial)
		(licencia GNU)
		(so linux))
	=> 	(printout t crlf "Se te recomienda la utilizacion de Inkscape " crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de Inkscape ")))
)

;;Definimos las reglas para el opcion6
(defrule opcion6-0
	(lenguaje-programacion
		(tipo modelado_3d)
		(licencia privativo)
		(so windows))
	=> 	(printout t crlf "Se te recomienda la utilizacion de Autodesk 3d MAX " crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de Autodesk 3d MAX ")))
)

(defrule opcion6-1
	(lenguaje-programacion
		(tipo modelado_3d)
		(licencia privativo)
		(so linux))
	=> 	(printout t crlf "Se te recomienda la utilizacion de Autodesk 3d MAX " crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de Autodesk 3d MAX ")))
)


(defrule opcion6-2
	(lenguaje-programacion
		(tipo modelado_3d)
		(licencia GNU)
		(so windows))
	=> 	(printout t crlf "Se te recomienda la utilizacion de Blender " crlf crlf)
		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de Blender ")))
)(defrule opcion6-3	(lenguaje-programacion		(tipo modelado_3d)		(licencia GNU)		(so linux))	=> 	(printout t crlf "Se te recomienda la utilizacion de Blender " crlf crlf)		(assert (recomendacion (mensaje "Se te recomienda la utilizacion de Blender "))))







