/*
 * ============================================================================
 *                   GNU Lesser General Public License
 * ============================================================================
 *
 * JasperReports - Free Java report-generating library.
 * Copyright (C) 2001-2005 Teodor Danciu teodord@users.sourceforge.net
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307, USA.
 * 
 * Teodor Danciu
 * 173, Calea Calarasilor, Bl. 42, Sc. 1, Ap. 18
 * Postal code 030615, Sector 3
 * Bucharest, ROMANIA
 * Email: teodord@users.sourceforge.net
 */
package net.sf.jasperreports.engine;


/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 * @version $Id$
 */
public interface JRImage extends JRGraphicElement, JRAnchor, JRHyperlink, JRAlignment
{


	/**
	 *
	 */
	public static final byte SCALE_IMAGE_CLIP = 1;
	public static final byte SCALE_IMAGE_FILL_FRAME = 2;
	public static final byte SCALE_IMAGE_RETAIN_SHAPE = 3;

	/**
	 *
	 */
	public static final byte ON_ERROR_TYPE_ERROR = 1;
	public static final byte ON_ERROR_TYPE_BLANK = 2;
	public static final byte ON_ERROR_TYPE_ICON = 3;


	/**
	 *
	 */
	public byte getScaleImage();

	/**
	 *
	 */
	public void setScaleImage(byte scaleImage);

	/**
	 *
	 */
	public byte getHorizontalAlignment();
		
	/**
	 *
	 */
	public void setHorizontalAlignment(byte horizontalAlignment);
		
	/**
	 *
	 */
	public byte getVerticalAlignment();
		
	/**
	 *
	 */
	public void setVerticalAlignment(byte verticalAlignment);
		
	/**
	 *
	 */
	public boolean isUsingCache();

	/**
	 *
	 */
	public void setUsingCache(boolean isUsingCache);

	/**
	 *
	 */
	public boolean isLazy();

	/**
	 *
	 */
	public void setLazy(boolean isLazy);

	/**
	 *
	 */
	public byte getOnErrorType();

	/**
	 *
	 */
	public void setOnErrorType(byte onErrorType);

	/**
	 *
	 */
	public byte getEvaluationTime();
		
	/**
	 *
	 */
	public JRGroup getEvaluationGroup();
		
	/**
	 *
	 */
	public JRExpression getExpression();
	
	/**
	 *
	 */
	public JRBox getBox();


}
