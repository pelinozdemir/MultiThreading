from asyncio import sleep
import multiprocessing
import string
import threading
from openpyxl import load_workbook
import pandas as pd
import pymysql
import xlsxwriter
import numpy as np
from nltk.tokenize import word_tokenize
from nltk.corpus import stopwords

import stopword


import pymysql

from sqlalchemy import create_engine
db_connection_str = 'mysql+pymysql://root:mysql26@localhost/bigdata'
engine = create_engine(db_connection_str)

def main33():
  stop = stopwords.words('english')
  df = pd.DataFrame()
  df= pd.read_csv('C:\Users\Pelin\Downloads\archive\rows.csv',skipinitialspace=True,encoding='utf8', engine='python',)
  
  #print(df)
  df.drop('Date received', axis = 1, inplace = True)
  df.drop('Sub-product', axis = 1, inplace = True)
  df.drop('Sub-issue', axis = 1, inplace = True)
  df.drop('Consumer complaint narrative', axis = 1, inplace = True)
  df.drop('Company public response', axis = 1, inplace = True)
  df.drop('Tags', axis = 1, inplace = True)
  df.drop('Consumer consent provided?', axis = 1, inplace = True)
  df.drop('Submitted via', axis = 1, inplace = True)
  df.drop('Date sent to company', axis = 1, inplace = True)
  df.drop('Company response to consumer', axis = 1, inplace = True)
  df.drop('Timely response?', axis = 1, inplace = True)
  df.drop('Consumer disputed?', axis = 1, inplace = True)
  print(df)
  df.dropna(inplace=True)
 
  df['Product']=df['Product'].str.replace(r'[^\w\s]+', '',regex=True)
  df['Product']=df['Product'].apply(lambda x:  ' '.join([word for word in x.split() if word not in (stop)]))
  df['Product']=df['Product'].apply(lambda x:  ' '.join([word for word in x.lower().split() if word not in (stopword.stopwordlist)]))
  df['Issue']=df['Issue'].str.replace(r'[^\w\s]+', '',regex=True)
  df['Issue']=df['Issue'].apply(lambda x:  ' '.join([word for word in x.split() if word not in (stop)]))
  df['Issue']=df['Issue'].apply(lambda x:  ' '.join([word for word in x.lower().split() if word not in (stopword.stopwordlist)]))

  df['Company']=df['Company'].str.replace(r'[^\w\s]+', '',regex=True)
  df['Company']=df['Company'].apply(lambda x:  ' '.join([word for word in x.split() if word not in (stop)]))
  df['Company']=df['Company'].apply(lambda x:  ' '.join([word for word in x.lower().split() if word not in (stopword.stopwordlist)]))
  df.dropna(inplace=True)
  df.to_sql(name='Table1', con=engine, if_exists='replace')

if __name__ == '__main__':
    main33()

  #print(df)
