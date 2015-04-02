package io.getgauge.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

public class SpecGenerator implements IGenerator {

//       override void doGenerate(Resource resource, IFileSystemAccess fsa) {
//             fsa.generateFile('greetings.txt', 'People to greet: ' + 
//                     resource.allContents
//                             .filter(typeof(Greeting))
//                             .map[name]
//                             .join(', '))
//       }	
	
	@Override
	public void doGenerate(Resource input, IFileSystemAccess fsa) {
		// TODO Auto-generated method stub

	}

}
