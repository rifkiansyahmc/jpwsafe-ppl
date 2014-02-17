/*
 * $Id$
 * 
 * Copyright (c) 2008 David Muller <roxon@users.sourceforge.net>.
 * All rights reserved. Use of the code is allowed under the
 * Artistic License 2.0 terms, as specified in the LICENSE file
 * distributed with this code, or available from
 * http://www.opensource.org/licenses/artistic-license-2.0.php
 */
package org.pwsafe.passwordsafej;

import javax.swing.JButton;

/**
 *
 * @author Kevin Preece
 */
public class OkButton extends JButton
{
	/**
	 * 
	 */
	public OkButton()
	{
		super();
		setText( I18nHelper.getInstance().formatMessage("button.ok") );
	}
}
