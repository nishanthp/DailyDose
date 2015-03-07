function isNumberKey(evt)
      {
         var charCode = (evt.which) ? evt.which : event.keyCode
         if (charCode > 31 && (charCode < 48 || charCode > 57))
            return false;

         return true;
      }

function isAlphabetKey(evt)

	{
		var char = (evt.which) ? evt.which : event.keyCode
         if (char > 31 && (char < 65 || char > 90))
            return false;

         return true; 
	}