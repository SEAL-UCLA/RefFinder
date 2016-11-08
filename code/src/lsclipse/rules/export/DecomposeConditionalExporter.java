/* 
*    Ref-Finder
*    Copyright (C) <2016> University of Szeged
*
*    This program is free software: you can redistribute it and/or modify
*    it under the terms of the GNU General Public License as published by
*    the Free Software Foundation, either version 3 of the License, or
*    (at your option) any later version.
*
*    This program is distributed in the hope that it will be useful,
*    but WITHOUT ANY WARRANTY; without even the implied warranty of
*    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*    GNU General Public License for more details.
*
*    You should have received a copy of the GNU General Public License
*    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package lsclipse.rules.export;

import java.util.ArrayList;
import java.util.List;

import lsclipse.views.Node;


// TODO: have to find out the what are the parameters of this refactoring
public class DecomposeConditionalExporter extends RefactoringCsvExporter {

	DecomposeConditionalExporter() {}
	
	@Override
	protected String fileName() {
		return "DECOMPOSE_CONDITIONAL.csv";
	}

	@Override
	protected List<String> columnNames() {
		List<String> columns = new ArrayList<String>();
		columns.add("TODO: unknown attributes");
		return columns;
	}

	@Override
	protected List<String> parameters(Node refactoring) {
		List<String> paramsWithPosition = new ArrayList<String>();
		String[] parameters = refactoring.params.substring(2, refactoring.params.length() - 2).split("\",\"");
		
//		paramsWithPosition.add(parameters[0] + "@" + LSDiffRunner.beforePositions.getPosition(parameters[0]).toString());
//		paramsWithPosition.add(parameters[0] + "@" + LSDiffRunner.afterPositions.getPosition(parameters[0]).toString());
//		paramsWithPosition.add(parameters[1]);
		

		for (String param : parameters) {
			paramsWithPosition.add(param);
		}
		
		return paramsWithPosition;
	}

}
