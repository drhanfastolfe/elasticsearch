// apuntes.13

{
	double newScore = 0;

	if(doc['outstanding'].value)
	{
		newScore = (_score + Math.log(doc['visits_old_es'].value)) * params.destacado;
	}
	else		
	{
		newScore = _score + Math.log(doc['visits_old_es'].value);
	} 

	return newScore;
}