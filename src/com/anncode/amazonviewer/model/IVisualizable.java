package com.anncode.amazonviewer.model;

import java.util.Date;


public interface IVisualizable {
	
	/**
	 * Este metodo captura el timpo exacto de visualización
	 * 
	 * @param  dateI es un objeto {@code Date} con el teimpo de inicio exacto
	 * @return Devuelve la fecha y hora capturada
	 * */
	
	Date startToSee(Date dateI);
	
	/**
	 * Este metodo captura el timpo exacto de visualización
	 * 
	 * @param  dateI es un objeto {@code Date} con el teimpo de inicio exacto
	 * @return Devuelve la fecha y hora capturada
	 * */
	void stopToSee(Date dateI, Date dateF);
	
}
