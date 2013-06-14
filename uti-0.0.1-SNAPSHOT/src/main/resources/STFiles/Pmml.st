package $package$;
import java.util.ArrayList;
import java.util.List;

import com.paypal.risk.idi.models.nn.NeuralInputs;
import com.paypal.risk.idi.models.nn.NeuralLayer;
import com.paypal.risk.idi.models.nn.NeuralNetwork;
import com.paypal.risk.idi.models.nn.Neuron;
import com.paypal.risk.idi.models.nn.PMML;

public class $classname$ extends extends PMML{
  
  private static $classname$ instance = null;
  
  public synchronized static PMML getPmml() {
    if (instance == null) {
      instance = new $classname$();
    }
    return instance;
  }
  
  private $classname$() {
    this.setNeuralNetwork(this.buildNeuralNetwork());
  }
  
  private NeuralNetwork buildNeuralNetwork() {
    NeuralNetwork nn = new NeuralNetwork();
    nn.setModelName("$model$");
    nn.setNeuralInputs(buildNeuralInputs());
    nn.addNeuralLayer(buildNeuralLayer1());
    nn.addNeuralLayer(buildNeuralLayer2());

    return nn;
  }
  
  private NeuralInputs buildNeuralInputs() {
    NeuralInputs ni = new NeuralInputs();
    List<String> neuralInputsList = new ArrayList<String>();
    ni.setNeuralInputsList(neuralInputsList);
    $neuralInputsList$
    return ni;
  }
  
  $NeuralLayer:{
  private NeuralLayer buildNeuralLayer$it.index$() {
    NeuralLayer nl = new NeuralLayer();
 	nl.setActivationFunction("$it.ActivationFunction$");
 	nl.setNumberOfNeurons("$it.NumberOfNeurons$");
 	
 	$it.Neurons$
    nl.setActivationFunction("logistic");
    nl.setNumberOfNeurons(1);
    nl.addNeuron(buildNeuronL2N21());
    return nl;
  }
  }$
  
  $BuildNeurons:{
  private Neuron buildNeuronL$it.layer$N$it.id$() {
		Neuron n = new Neuron();
		n.setBias($it.bias$);
		n.setId("$it.id$");
		$it.con$
		return n;
  }
  }$
  
}