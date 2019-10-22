#!"C:\Users\João Victor\Documents\João\Ciência da Computação\5º semestre\Grafos\AlgoritimosGrafos\Python\Scripts\python.exe" -x
# EASY-INSTALL-ENTRY-SCRIPT: 'pip==19.3.1','console_scripts','pip'
__requires__ = 'pip==19.3.1'
import re
import sys
from pkg_resources import load_entry_point

if __name__ == '__main__':
    sys.argv[0] = re.sub(r'(-script\.pyw?|\.exe)?$', '', sys.argv[0])
    sys.exit(
        load_entry_point('pip==19.3.1', 'console_scripts', 'pip')()
    )
